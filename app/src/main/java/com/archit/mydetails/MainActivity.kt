package com.archit.mydetails

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    internal lateinit var mButton: Button
    internal lateinit var mEdit: EditText
    internal lateinit var mText: TextView

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton = findViewById<View>(R.id.button1) as Button

        mButton.setOnClickListener {

            mEdit = findViewById(R.id.nametext) as EditText
            mText = findViewById(R.id.nametext1) as TextView
            mText.text = "Welcome " + mEdit.text.toString() + "!"


            mEdit = findViewById(R.id.emailtext) as EditText
            mText = findViewById(R.id.emailtext1) as TextView
            mText.text = mEdit.text.toString()

            mEdit = findViewById(R.id.phonetext) as EditText
            mText = findViewById(R.id.phonetext1) as TextView
            mText.text = "Contact at: " + mEdit.text.toString()

        }
    }
}