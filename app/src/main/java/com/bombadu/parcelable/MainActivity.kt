package com.bombadu.parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        const val USER = "user"
        const val PERSONAL_INFO = "personalInfo"
        const val LOCATION = "location"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User("michael", "qqqq", PersonalInfo("Michael", "May"))
        val personalInfo = PersonalInfo("Michael", "May")
        val location = Location("Delray Beach", "Florida")

        myButton.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra(LOCATION, location)
            intent.putExtra(PERSONAL_INFO, personalInfo)
            startActivity(intent)
        }
    }
}