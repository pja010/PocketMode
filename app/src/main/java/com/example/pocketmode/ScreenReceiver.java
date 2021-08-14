package com.example.pocketmode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScreenReceiver extends BroadcastReceiver {

    public static boolean isScreenOff = true;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF
        )) {
            isScreenOff = false;
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            isScreenOff = true;
        }
        Intent screenIntent = new Intent(context, ApplicationService.class);
        screenIntent.putExtra("SCREEN_STATE", isScreenOff);
        context.startService(screenIntent);
    }
}
