package com.permittest.jargueta
import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import com.permittest.jargueta.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var LanguagePreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // Retrieve the language preference from SharedPreferences
        LanguagePreferences = getSharedPreferences("LanguagePreferences", MODE_PRIVATE)
        // Retrieve the language preference from SharedPreferences
        val languagePreference = LanguagePreferences.getString("language", "en")

        // Update the app's language configuration based on the saved preference
        updateLanguage(languagePreference)

        // Initialize the UI in onCreate
        updateUI()

        binding.btnStart.setOnClickListener {
            val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
            startActivity(intent)
        }
        binding.btnLanguage.setOnClickListener {
            val intent = Intent(this@MainActivity, LanguageActivity::class.java)
            startActivity(intent)
        }
    }

    private fun updateLanguage(languageCode: String?) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val configuration = Configuration()
        configuration.setLocale(locale)
        baseContext.resources.updateConfiguration(configuration, baseContext.resources.displayMetrics)
    }

    override fun onResume() {
        super.onResume()

        // Update the UI when the activity resumes
        updateUI()
        updateLanguage(LanguagePreferences.getString("language", "en"))
    }

    private fun updateUI() {
        val setupTextView = findViewById<TextView>(R.id.main_text)
        val disclaimerTextView = findViewById<TextView>(R.id.disclaimer)

        // Retrieve the language preference from SharedPreferences
        val languagePreference = LanguagePreferences.getString("language", "en")

        // Determine the appropriate string resource based on the language preference
        val setupStringResourceId = when (languagePreference) {
            "es" -> R.string.setup // Replace with your Spanish string resource
            else -> R.string.setup // Default to the string in the default language
        }

        val disclaimerStringResourceId = when (languagePreference) {
            "es" -> R.string.disclaimer // Replace with your Spanish string resource
            else -> R.string.disclaimer // Default to the string in the default language
        }

        // Set the text of the TextView using the selected string resource
        setupTextView.text = getString(setupStringResourceId)
        disclaimerTextView.text = getString(disclaimerStringResourceId)

    }
}
