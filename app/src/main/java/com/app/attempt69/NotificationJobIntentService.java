package com.app.attempt69;// NotificationJobIntentService.java
import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

public class NotificationJobIntentService extends IntentService {

    public NotificationJobIntentService() {
        super("NotificationJobIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        // Handle background work, e.g., show notifications
        // ...

        // If you need to reschedule the service, use JobIntentService.enqueueWork
        // NotificationJobIntentService.enqueueWork(context, intent);
    }
}
