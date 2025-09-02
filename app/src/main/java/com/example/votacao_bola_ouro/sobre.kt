package com.example.votacao_bola_ouro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sobre)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSair: Button = findViewById(R.id.btnSair)

        btnSair.setOnClickListener {
            finishAffinity()
            System.exit(0)
        }

        val bnHome = findViewById<LinearLayout>(R.id.bnHome)
        bnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val bnVote = findViewById<LinearLayout>(R.id.bnVote)
        bnVote.setOnClickListener {
            val intent = Intent(this, votacao::class.java)
            startActivity(intent)
        }

    }//fim oncreate

}//fim codigo