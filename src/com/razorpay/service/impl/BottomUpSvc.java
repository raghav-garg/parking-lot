package com.razorpay.service.impl;

import java.util.List;
import com.razorpay.Level;
import com.razorpay.ParkingNumber;
import com.razorpay.service.GenericSerive;

public class BottomUpSvc extends GenericSerive{

  @Override
  public ParkingNumber getNextSlot(List<Level> levels) {
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

}
