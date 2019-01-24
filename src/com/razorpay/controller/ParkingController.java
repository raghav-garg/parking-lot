package com.razorpay.controller;

import java.util.ArrayList;
import java.util.List;
import com.razorpay.Level;
import com.razorpay.enums.ParkingApproach;
import com.razorpay.service.ParkingService;

public class ParkingController {


    //persist in cache
    List<Level> levels = new ArrayList<>();
    private ParkingService parkingService = new ParkingService(); 
    //default value
    private ParkingApproach parkingApproach = ParkingApproach.BOTTOMUP;

  
  //it can handle vehicle type and custom parking option
  //public ParkingUnparkingResponse park(ParkingUnparkingRequest parkingUnparkingRequest)
    
  public void buildParkingSystem(int levelNumbers , int spotsPerLevel ) {
    levels=parkingService.buildSystem(levelNumbers,spotsPerLevel);
    
  }
  
  public void buildParkingSystem(int levelNumbers , int spotsPerLevel ,ParkingApproach parkingApproach) {
    levels=parkingService.buildSystem(levelNumbers,spotsPerLevel);
    parkingApproach= this.parkingApproach;
  }
  
  public boolean park(String numberPlate) {
    //logging request for parking
   boolean parked =
    parkingService.parkVehicle(numberPlate,levels,parkingApproach);
   if(parked){
     System.out.println("success park");
   }else {
     System.out.println("fail park");
   }
   return parked;
  }
  
  public boolean unpark(String numberPlate) {
    //logging request for unparking
    
    boolean unparked= parkingService.unparkVehicle(numberPlate, levels,parkingApproach);
    if(unparked){
      System.out.println("success unpark");
    }else {
      System.out.println("fail unpark");
    }
    return unparked;
  }
  
  public void printMap() {
    //logging request for unparking
    
    parkingService.printMap();
   
  }
  
  public static void main(String[] args) {
    ParkingController pc = new ParkingController();
    pc.buildParkingSystem(2, 2);
    pc.park("HR23");
    pc.park("HR26");
    pc.park("HR28");
    pc.park("HR25");
//    pc.unpark("HR23");
    pc.park("DL21");
    pc.printMap();
    
  }
}
