package com.thongpq.rideruberremake.Common;

import com.thongpq.rideruberremake.Model.RiderModel;

public class Common {
    public static final String RIDER_INFO_REFERENCE = "Rider";
    public static RiderModel currentRider;

    public static String buildWelcomeMessage() {
        if (Common.currentRider != null) {
            return new StringBuilder("Welcome ")
                    .append(Common.currentRider.getFirstName())
                    .append(" ")
                    .append(Common.currentRider.getLastName())
                    .toString();
        } else {
            return " ";
        }
    }
}
