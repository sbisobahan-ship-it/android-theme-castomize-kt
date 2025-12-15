package com.buildbdapp.graphio

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class GraphioApp : Application() {

    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setDefaultNightMode(
            AppCompatDelegate.MODE_NIGHT_YES
        )
    }
}
