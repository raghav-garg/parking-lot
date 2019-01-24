package com.razorpay;

import java.util.LinkedList;
import java.util.List;

public class Level {

  private int totalSpots = 10;
  private int floorNumber;
  private int availableSlots;
  //now only spot int can also work
  private List<ParkingNumber> filledList = new LinkedList<>();
  private List<ParkingNumber> unfilledList= new LinkedList<>();
  public int getTotalSpots() {
    return totalSpots;
  }
  public void setTotalSpots(int totalSpots) {
    this.totalSpots = totalSpots;
  }
  public int getFloorNumber() {
    return floorNumber;
  }
  public void setFloorNumber(int floorNumber) {
    this.floorNumber = floorNumber;
  }
  public int getAvailableSlots() {
    return unfilledList.size();
  }
  public void setAvailableSlots(int availableSlots) {
    this.availableSlots = availableSlots;
  }
  public List<ParkingNumber> getFilledList() {
    return filledList;
  }
  public void setFilledList(List<ParkingNumber> filledList) {
    this.filledList = filledList;
  }
  public List<ParkingNumber> getUnfilledList() {
    return unfilledList;
  }
  public void setUnfilledList(List<ParkingNumber> unfilledList) {
    this.unfilledList = unfilledList;
  }
  public Level(int totalSpots, int floorNumber, int availableSlots, List<ParkingNumber> filledList,
      List<ParkingNumber> unfilledList) {
    super();
    this.totalSpots = totalSpots;
    this.floorNumber = floorNumber;
    this.availableSlots = availableSlots;
    this.filledList = filledList;
    this.unfilledList = unfilledList;
  }
  public Level(int totalSpots, int floorNumber) {
    super();
    this.totalSpots = totalSpots;
    this.floorNumber = floorNumber;
    this.filledList = new LinkedList<>();
    this.unfilledList = new LinkedList<>();
    for(int i=0; i< totalSpots ; i++) {
      ParkingNumber pn = new ParkingNumber(floorNumber, i);
      unfilledList.add(pn);
    }
  }
  
  
  
  
}
