package dev.mahmoud_ashraf.onesignal.OneSignal;


import android.util.Log;
import com.onesignal.OSNotification;
import com.onesignal.OneSignal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class OneSignalNotificationReceivedHandler implements OneSignal.NotificationReceivedHandler {
    @Override
    public void notificationReceived(OSNotification notification) {
        Log.e("ddd coming .......","ccccccc");
    }
}
