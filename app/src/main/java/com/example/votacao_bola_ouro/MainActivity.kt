package com.example.votacao_bola_ouro

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*
        val btnVote = findViewById<AppCompatButton>(R.id.btnVote)
        btnVote.setOnClickListener {
            val intent = Intent(this, OutraLayoutAqui1::class.java)
            startActivity(intent)
        }

        val bnVote = findViewById<LinearLayout>(R.id.bnVote)
        bnVote.setOnClickListener {
            val intent = Intent(this, OutroLayoutAqui1::class.java)
            startActivity(intent)
        }

        val bnSobre = findViewById<LinearLayout>(R.id.bnSobre)
        bnSobre.setOnClickListener {
            val intent = Intent(this, OutroLayoutAqui2::class.java)
            startActivity(intent)
        }
        */

    }// fim oncreate
}// fim codigo