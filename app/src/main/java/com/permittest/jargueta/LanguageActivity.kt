package com.permittest.jargueta
import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.permittest.jargueta.R
import java.util.*

class LanguageActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_language)

        sharedPreferences = getSharedPreferences("LanguagePreferences", MODE_PRIVATE)
        val currentLanguage = sharedPreferences.getString("language", "en")

        Log.d("LanguageActivity", "Current Language: $currentLanguage")

        val btnEnglish = findViewById<Button>(R.id.btn_english)
        val btnSpanish = findViewById<Button>(R.id.btn_spanish)
        val btnBack = findViewById<Button>(R.id.btn_back)

        btnEnglish.setOnClickListener {
            saveLanguagePreference("en")
            updateLanguage("en")
        }

        btnSpanish.setOnClickListener {
            saveLanguagePreference("es")
            updateLanguage("es")
        }

        btnBack.setOnClickListener {
            finish()
        }

        // Update the text on the buttons based on the current language preference
        updateButtonLanguage(currentLanguage)
    }

    private fun saveLanguagePreference(languageCode: String) {
        val editor = sharedPreferences.edit()
        editor.putString("language", languageCode)
        editor.apply()

        Log.d("LanguageActivity", "Language Preference saved: $languageCode")
    }

    private fun updateButtonLanguage(languageCode: String?) {
        val btnEnglish = findViewById<Button>(R.id.btn_english)
        val btnSpanish = findViewById<Button>(R.id.btn_spanish)

        if (languageCode == "en") {
            btnEnglish.text = getString(R.string.english)
            btnSpanish.text = getString(R.string.spanish)
        } else if (languageCode == "es") {
            btnEnglish.text = getString(R.string.ingles) // Set the English button text to "Ingles"
            btnSpanish.text = getString(R.string.espanol) // Set the Spanish button text to "Español"
        }
    }

    private fun updateLanguage(languageCode: String) {
        val editor = sharedPreferences.edit()
        editor.putString("language", languageCode)
        editor.apply()

        Log.d("LanguageActivity", "Language Preference saved: $languageCode")

        // Update the app's language and restart the activity
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val configuration = Configuration()
        configuration.setLocale(locale)
        baseContext.resources.updateConfiguration(configuration, baseContext.resources.displayMetrics)

        recreate() // Restart the activity to apply the new language
    }
}
