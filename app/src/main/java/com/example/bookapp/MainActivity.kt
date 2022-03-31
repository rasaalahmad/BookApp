package com.example.bookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.sql.Types.NULL

class MainActivity : AppCompatActivity() {
    private val act = "com.android.book.alphabetA"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startClick(view: View)
    {
        val intent = Intent(this, AlphabetA::class.java)
        intent.putExtra(act,NULL)
        startActivity(intent)
    }
}