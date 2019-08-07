package dev.mahmoud_ashraf.onesignal;

import android.content.Context;

import com.onesignal.OneSignal;
import dev.mahmoud_ashraf.onesignal.OneSignal.OneSignalNotificationOpenedHandler;
import dev.mahmoud_ashraf.onesignal.OneSignal.OneSignalNotificationReceivedHandler;

public class Application extends android.app.Application {
    public static Context publiContext;

    @Override
    public void onCreate() {
        super.onCreate();
        publiContext = getApplicationContext();
        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .setNotificationReceivedHandler(new OneSignalNotificationReceivedHandler())
                .setNotificationOpenedHandler(new OneSignalNotificationOpenedHandler())
                .init();
    }

}




