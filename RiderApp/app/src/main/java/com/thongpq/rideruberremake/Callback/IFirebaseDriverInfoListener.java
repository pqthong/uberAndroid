package com.thongpq.rideruberremake.Callback;

import com.thongpq.rideruberremake.Model.DriverGeoModel;

public interface IFirebaseDriverInfoListener {
    void onDriverInfoLoadSuccess(DriverGeoModel driverGeoModel);
}
