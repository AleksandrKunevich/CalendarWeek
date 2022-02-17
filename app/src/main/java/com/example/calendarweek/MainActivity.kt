package com.example.calendarweek

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_week_view) {
    override fun onStart() {
        super.onStart()
        supportFragmentManager
            .beginTransaction()
            .addToBackStack("FirstFragment.TAG")
            .add(R.id.container, BlankFragment())
            .commit()
    }
}