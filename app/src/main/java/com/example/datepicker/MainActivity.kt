package com.example.datepicker


import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.datepicker.MaterialStyledDatePickerDialog
import com.google.android.material.datepicker.MaterialTextInputPicker
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.tvacstudio.materialdatepicker.DateValidatorWeekdays
import java.util.*

class MainActivity : AppCompatActivity() {


    lateinit var mDOB: DatePicker
    lateinit var mSetDate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mDOB = findViewById(R.id.uiDOBDp)
        mSetDate = findViewById(R.id.uiSetDateButton)

        mSetDate.setOnClickListener {
            val mDay = "Day = " + mDOB.dayOfMonth
            val mMonth = "Month = " + (mDOB.month + 1)
            val mYear = "Year = " + mDOB.year
            // display the values by using a toast
            Toast.makeText(applicationContext, mDay + "\n" + mMonth + "\n" + mYear, Toast.LENGTH_LONG).show()
        }
    }
}
