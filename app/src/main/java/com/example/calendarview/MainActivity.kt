package com.example.calendarview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.ZoneId

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var clndView = findViewById<CalendarView>(R.id.calendarView)
        var wyjbtn = findViewById<Button>(R.id.wyjbtn)
        var przybtn = findViewById<Button>(R.id.przybtn)
        var wyjlbl = findViewById<TextView>(R.id.wyjlbl)
        var przylbl = findViewById<TextView>(R.id.przylbl)
        var ilosclbl = findViewById<TextView>(R.id.ilosclbl)

        clndView.minDate = System.currentTimeMillis()
        clndView.maxDate = LocalDate.now().plusYears(2).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()





    }
}