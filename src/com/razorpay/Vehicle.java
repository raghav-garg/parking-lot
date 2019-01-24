package com.razorpay;

import com.razorpay.enums.ParkingSpace;

public abstract class Vehicle {
  private String numberPlate;
  private String name="default";
  private String description="none";
  private ParkingSpace parkingSpace= ParkingSpace.MEDIUM;
  
  public String getNumberPlate() {
    return numberPlate;
  }
  public void setNumberPlate(String numberPlate) {
    this.numberPlate = numberPlate;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public ParkingSpace getParkingSpace() {
    return parkingSpace;
  }
  public void setParkingSpace(ParkingSpace parkingSpace) {
    this.parkingSpace = parkingSpace;
  }
  public Vehicle(String numberPlate, String name, String description, ParkingSpace parkingSpace) {
    super();
    this.numberPlate = numberPlate;
    this.name = name;
    this.description = description;
    this.parkingSpace = parkingSpace;
  }
  public Vehicle(String numberPlate) {
    super();
    this.numberPlate = numberPlate;
  }
  @Override
  public String toString() {
    return "Vehicle [numberPlate=" + numberPlate + ", name=" + name + ", description=" + description
        + ", parkingSpace=" + parkingSpace + "]";
  }
  
  
  
}
