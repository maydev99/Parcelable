package com.bombadu.parcelable

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        intent?.let {
            val location = intent.extras?.getParcelable<Location>(MainActivity.LOCATION)
            val personalInfo = intent.extras?.getParcelable<PersonalInfo>(MainActivity.PERSONAL_INFO)
            /*val userName = user?.username.toString()
            val password = user?.password.toString()
            val name = user?.info?.name.toString()
            val surname = user?.info?.surname.toString()
            textView.text = "Username: $userName Password: $password " +
                    "\n\n Name: $name \n Surname: $surname"*/

            textView.text = "${personalInfo?.name} ${personalInfo?.surname}\n${location?.city}\n${location?.state}"
        }
    }
}