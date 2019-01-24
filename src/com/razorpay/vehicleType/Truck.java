package com.razorpay.vehicleType;

import com.razorpay.Vehicle;
import com.razorpay.enums.ParkingSpace;

public class Truck extends Vehicle{
  
  private ParkingSpace parkingSpace= ParkingSpace.SMALL;

  public Truck(String numberPlate, String name, String description) {
    super(numberPlate, name, description, ParkingSpace.SMALL);
  }

  public Truck(String numberPlate) {
    super(numberPlate);
  }
  
}
