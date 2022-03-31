package com.example.bookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.sql.Types

class AlphabetV : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet_v)
    }

    private val act = "com.android.book.alphabetW"

    fun startPrevious(view: View) {
        finish()
    }

    fun startClick(view: View) {
        val intent = Intent(this, AlphabetW::class.java)
        intent.putExtra(act, Types.NULL)
        startActivity(intent)
    }
}