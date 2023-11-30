package com.app.attempt69;// BootReceiver.java
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.app.attempt69.NotificationService;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent serviceIntent = new Intent(context, NotificationService.class);
            context.startService(serviceIntent);
        }
    }
}
