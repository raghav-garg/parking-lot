package com.razorpay.factory;

import com.razorpay.enums.ParkingApproach;
import com.razorpay.service.GenericSerive;
import com.razorpay.service.impl.BottomUpSvc;
import com.razorpay.service.impl.TopDownSvc;

public class GenericSvcFactory {

  public static GenericSerive getObject(ParkingApproach parkingApproach) {
    GenericSerive genericSerive ;
    if(parkingApproach.equals(ParkingApproach.BOTTOMUP)) {
      genericSerive = new BottomUpSvc(); 
    }else {
      genericSerive = new TopDownSvc(); 
    }
    return genericSerive;
  }
}
