package com.example.bruger.knowwhere;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

/**
 * Created by Bruger on 09-11-2018.
 */

public class Permission {

    String[] permission_all = {""};
    String[] permission_GoogleMaps = {"Manifest.permission.BLUETOOTH"};
    String[] permission_AR = {""};


    private void permissionAll(Context context, Activity activity){
        for(String str : permission_all){
            if(ActivityCompat.checkSelfPermission(context, str)
                    != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(activity, new String[]{str}, 1);

            };
        }
    }

    private void permissionGoogleMaps(Context context, Activity activity){
        for(String str : permission_GoogleMaps){
            if(ActivityCompat.checkSelfPermission(context, str)
                    != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(activity, new String[]{str}, 1);

            };
        }

    }

    private void permission_AR(Context context, Activity activity){
        for(String str : permission_AR){
            if(ActivityCompat.checkSelfPermission(context, str)
                    != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(activity, new String[]{str}, 1);

            };
        }
    }

}
