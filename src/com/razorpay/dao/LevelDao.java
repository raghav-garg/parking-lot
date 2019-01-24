package com.razorpay.dao;

import com.razorpay.Vehicle;
import com.razorpay.vehicleType.Car;

public class LevelDao {

  public Vehicle getVehicle(String numberPlate) {
    //get it from db, dummy
    return new Car(numberPlate);
  }
}
