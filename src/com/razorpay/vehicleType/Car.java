package com.razorpay.vehicleType;

import com.razorpay.Vehicle;
import com.razorpay.enums.ParkingSpace;

public class Car extends Vehicle{
  
  private ParkingSpace parkingSpace= ParkingSpace.MEDIUM;

  public Car(String numberPlate, String name, String description) {
    super(numberPlate, name, description, ParkingSpace.MEDIUM);
  }

  public Car(String numberPlate) {
    super(numberPlate);
  }
  
}
