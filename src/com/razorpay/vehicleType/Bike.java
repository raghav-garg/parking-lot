package com.razorpay.vehicleType;

import com.razorpay.Vehicle;
import com.razorpay.enums.ParkingSpace;

public class Bike extends Vehicle{
  
  private ParkingSpace parkingSpace= ParkingSpace.LARGE;

  public Bike(String numberPlate, String name, String description) {
    super(numberPlate, name, description, ParkingSpace.LARGE);
  }

  public Bike(String numberPlate) {
    super(numberPlate);
  }
  
}
