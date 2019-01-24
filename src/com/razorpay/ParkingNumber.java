package com.razorpay;

public class ParkingNumber {
  private int levelNumber;
  private int seqNumber;
  public int getLevelNumber() {
    return levelNumber;
  }
  public void setLevelNumber(int levelNumber) {
    this.levelNumber = levelNumber;
  }
  public int getSeqNumber() {
    return seqNumber;
  }
  public void setSeqNumber(int seqNumber) {
    this.seqNumber = seqNumber;
  }
  public ParkingNumber(int levelNumber, int seqNumber) {
    super();
    this.levelNumber = levelNumber;
    this.seqNumber = seqNumber;
  }
  @Override
  public String toString() {
    return "ParkingNumber [levelNumber=" + levelNumber + ", seqNumber=" + seqNumber + "]";
  }
  
  

}
