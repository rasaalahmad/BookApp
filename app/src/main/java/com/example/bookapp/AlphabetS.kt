package com.example.bookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.sql.Types

class AlphabetS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet_s)
    }

    private val act = "com.android.book.alphabetT"

    fun startPrevious(view: View) {
        finish()
    }

    fun startClick(view: View) {
        val intent = Intent(this, AlphabetT::class.java)
        intent.putExtra(act, Types.NULL)
        startActivity(intent)
    }
}