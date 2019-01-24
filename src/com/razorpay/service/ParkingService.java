package com.razorpay.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.razorpay.Level;
import com.razorpay.ParkingNumber;
import com.razorpay.Vehicle;
import com.razorpay.VehicleToPNMapping;
import com.razorpay.enums.ParkingApproach;
import com.razorpay.factory.GenericSvcFactory;
import com.razorpay.vehicleType.Car;

public class ParkingService {

  Map<String, VehicleToPNMapping> map = new HashMap<>();
  private GenericSerive genericSerive ;
  public boolean parkVehicle(String numberPlate, List<Level> levels, ParkingApproach parkingApproach) {
    
    boolean isSuccess = true;
    //use factory pattern here if type is give
    Vehicle vehicle = new Car(numberPlate);
    
    genericSerive = GenericSvcFactory.getObject(parkingApproach);
   
    ParkingNumber parkingNumber=genericSerive.getNextSlot(levels);
    if(parkingNumber==null) {
      isSuccess=false;
    }
    
    VehicleToPNMapping vehicleToPNMapping = new VehicleToPNMapping(vehicle, parkingNumber);
    
    map.put(vehicle.getNumberPlate(), vehicleToPNMapping);
    
  
    
    //also can have hashmap for reducing this complexity

    
    return isSuccess;
  }
  
  
  public boolean unparkVehicle(String numberPlate, List<Level> levels, ParkingApproach parkingApproach) {
    
    boolean isSuccess = true;
    //use factory pattern here if type is give
   
    VehicleToPNMapping vpn = map.get(numberPlate);
    Vehicle vehicle = vpn.getVehicle();
    
    ParkingNumber parkingNumber=getParkedSlot(vehicle, levels);
    if(parkingNumber==null) {
      isSuccess=false;
    }
    
   
        
    return isSuccess;
  }

  private ParkingNumber getParkedSlot(Vehicle vehicle, List<Level> levels) {
    
    List<ParkingNumber> filledList = null, unfilledList = new LinkedList<>();
    if(!map.containsKey(vehicle.getNumberPlate())) {
      return null;
    }else {
      VehicleToPNMapping vehicleToPNMapping = map.get(vehicle.getNumberPlate());
      int level = vehicleToPNMapping.getParkingNumber().getLevelNumber();
      Level levelObject = levels.get(level);
      filledList = levelObject.getFilledList();
      filledList.remove(vehicle);
      ParkingNumber pn=  vehicleToPNMapping.getParkingNumber();
      unfilledList.add(pn);
      return pn;
    }
    
  }


  private ParkingNumber getNextSlot(List<Level> levels) {
    
    //approach
  List<ParkingNumber> filledList=null, unfilledList=null;
    for(Level level : levels) {
      if(level.getAvailableSlots()!=0) {
       filledList= level.getFilledList();
       unfilledList= level.getUnfilledList();
       break;
      }
    }
    if(unfilledList==null || unfilledList.isEmpty()) {
      return null;
    }else {
      ParkingNumber parkingNumber = unfilledList.get(0);
      
      unfilledList.remove(parkingNumber);
      filledList.add(parkingNumber);
      return parkingNumber;
    }

  }


  public List<Level> buildSystem(int levelNumbers, int spotsPerLevel) {
    List<Level> levelList = new ArrayList<>();
    for(int i =0; i<levelNumbers; i++) {
      Level level = new Level(spotsPerLevel, i);
      level.setAvailableSlots(spotsPerLevel);
      levelList.add(level);
      
    }
    
    return levelList;
      
    
  }


  public void printMap() {
    System.out.println(map);
    
  }
}
