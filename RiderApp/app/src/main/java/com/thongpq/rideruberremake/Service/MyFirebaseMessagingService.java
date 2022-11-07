package com.thongpq.rideruberremake.Service;

import androidx.annotation.NonNull;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.thongpq.rideruberremake.Common.Common;
import com.thongpq.rideruberremake.Utils.UserUtils;

import java.util.Map;
import java.util.Random;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        Map<String, String> dataRecv = message.getData();
        if (dataRecv != null) {
            Common.showNotification(this, new Random().nextInt(), dataRecv.get(Common.NOTI_TITLE),dataRecv.get(Common.NOTI_CONTENT),null);
        }
    }

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        if (FirebaseAuth.getInstance().getCurrentUser() != null ){
            UserUtils.updateToken(this, token);
        }
    }
}
