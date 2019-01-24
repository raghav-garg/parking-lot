package com.razorpay;

import java.util.Date;


//change to mao
public class VehicleToPNMapping {

  private Vehicle vehicle;
  
  private ParkingNumber parkingNumber;
  
  private Date parkedInTime;
  
  private Date parkedOutTime;
  
  
  public Date getParkedInTime() {
    return parkedInTime;
  }


  public void setParkedInTime(Date parkedInTime) {
    this.parkedInTime = parkedInTime;
  }


  public Date getParkedOutTime() {
    return parkedOutTime;
  }


  public void setParkedOutTime(Date parkedOutTime) {
    this.parkedOutTime = parkedOutTime;
  }


  public Vehicle getVehicle() {
    return vehicle;
  }


  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }


  public ParkingNumber getParkingNumber() {
    return parkingNumber;
  }


  public void setParkingNumber(ParkingNumber parkingNumber) {
    this.parkingNumber = parkingNumber;
  }
  
  
  public VehicleToPNMapping(Vehicle vehicle, ParkingNumber parkingNumber) {
    super();
    this.vehicle = vehicle;
    this.parkingNumber = parkingNumber;
  }


  @Override
  public String toString() {
    return "VehicleToPNMapping [vehicle=" + vehicle + ", parkingNumber=" + parkingNumber + "]";
  }
  
  
}
