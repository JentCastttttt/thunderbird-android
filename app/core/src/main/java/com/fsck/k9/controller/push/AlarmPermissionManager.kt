package com.fsck.k9.controller.push

import android.content.Context
import android.os.Build
import com.fsck.k9.helper.AlarmManagerCompat

/**
 * Checks whether the app can schedule exact alarms.
 */
internal interface AlarmPermissionManager {
    fun canScheduleExactAlarms(): Boolean
    fun registerListener(listener: AlarmPermissionListener)
    fun unregisterListener()
}

/**
 * Factory method to create an Android API-specific instance of [AlarmPermissionManager].
 */
internal fun AlarmPermissionManager(context: Context, alarmManagerCompat: AlarmManagerCompat): AlarmPermissionManager {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        AlarmPermissionManagerApi31(context, alarmManagerCompat)
    } else {
        AlarmPermissionManagerApi21()
    }
}

internal fun interface AlarmPermissionListener {
    fun onAlarmPermissionGranted()
}
