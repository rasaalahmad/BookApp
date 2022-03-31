package com.example.bookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.sql.Types

class AlphabetC : AppCompatActivity() {
    private val act = "com.android.book.alphabetD"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet_c)
    }

    fun startPrevious(view: View) {
        finish()
    }
    fun startClick(view: View) {
        val intent = Intent(this, AlphabetD::class.java)
        intent.putExtra(act, Types.NULL)
        startActivity(intent)
    }
}