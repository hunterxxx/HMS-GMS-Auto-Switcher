package com.huawei.gmshms

import android.content.Context
import android.util.Log
import com.google.android.gms.common.GoogleApiAvailability
import com.huawei.hms.api.ConnectionResult
import com.huawei.hms.api.HuaweiApiAvailability

object HmsGmsUtil {
    private const val TAG = "HmsGmsUtil"
    fun isHmsAvailable(context: Context?): Boolean {
        var isAvailable = false
        if (null != context) {
            val result =
                HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context)
            isAvailable = ConnectionResult.SUCCESS == result
        }
        Log.i(TAG, "isHmsAvailable: $isAvailable")
        return isAvailable
    }

    fun isGmsAvailable(context: Context?): Boolean {
        var isAvailable = false
        if (null != context) {
            val result =
                GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context)
            isAvailable = com.google.android.gms.common.ConnectionResult.SUCCESS == result
        }
        Log.i(TAG, "isGmsAvailable: $isAvailable")
        return isAvailable
    }
}