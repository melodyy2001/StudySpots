package com.vima.studyspots

import android.app.Application
import com.google.android.material.color.DynamicColors

class StudySpotsApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // Apply dynamic color
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}