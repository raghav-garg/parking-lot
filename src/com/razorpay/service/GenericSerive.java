package com.razorpay.service;

import java.util.List;
import com.razorpay.Level;
import com.razorpay.ParkingNumber;

public abstract class GenericSerive {

  public abstract ParkingNumber getNextSlot(List<Level> levels);
  
}
