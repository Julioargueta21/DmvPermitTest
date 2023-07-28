package com.permittest.jargueta

import android.app.Application
import android.content.Context


class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        // Initialize SharedPreferences here
        val languagePreferences = getSharedPreferences("LanguagePreferences", Context.MODE_PRIVATE)
        val editor = languagePreferences.edit()
        // ...
    }

}