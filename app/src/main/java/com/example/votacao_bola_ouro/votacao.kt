package com.example.votacao_bola_ouro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class votacao : AppCompatActivity() {

    var votosDembele = 0
    var votosYamal = 0
    var votosVitinha = 0
    var votosRaphinha = 0
    var votosSalah = 0
    var votosBranco = 0
    var votosNulo = 0
    var totalVotos = 0

    private lateinit var votosDembeleText: TextView
    private lateinit var votosYamalText: TextView
    private lateinit var votosVitinhaText: TextView
    private lateinit var votosRaphinhaText: TextView
    private lateinit var votosSalahText: TextView
    private lateinit var votosBrancoText: TextView
    private lateinit var votosNuloText: TextView
    private lateinit var totalVotosText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_votacao)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bnHome = findViewById<LinearLayout>(R.id.bnHome)
        bnHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        /*val bnSobre = findViewById<LinearLayout>(R.id.bnSobre)
        bnSobre.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } */

        // texto la no resumo
        votosDembeleText = findViewById(R.id.votosDembele)
        votosYamalText = findViewById(R.id.votosYamal)
        votosVitinhaText = findViewById(R.id.votosVitinha)
        votosRaphinhaText = findViewById(R.id.votosRaphinha)
        votosSalahText =  findViewById(R.id.votosSalah)
        votosBrancoText = findViewById(R.id.votosBranco)
        votosNuloText = findViewById(R.id.votosNulo)
        totalVotosText = findViewById(R.id.totalVotos)

        // botoes dos cards
        val btnVotoDembele: Button = findViewById(R.id.btnVotoDembele)
        val btnVotoYamal: Button = findViewById(R.id.btnVotoYamal)
        val btnVotoVitinha: Button = findViewById(R.id.btnVotoVitinha)
        val btnVotoRaphinha: Button = findViewById(R.id.btnVotoRaphinha)
        val btnVotoBranco: Button = findViewById(R.id.btnVotoBranco)
        val btnVotoNulo: Button = findViewById(R.id.btnVotoNulo)
        val btnVotoSalah: Button = findViewById(R.id.btnVotoSalah)

        btnVotoDembele.setOnClickListener {
            votosDembele++
            totalVotos++
            atualizarResumo()
        }

        btnVotoYamal.setOnClickListener {
            votosYamal++
            totalVotos++
            atualizarResumo()
        }

        btnVotoVitinha.setOnClickListener {
            votosVitinha++
            totalVotos++
            atualizarResumo()
        }

        btnVotoRaphinha.setOnClickListener {
            votosRaphinha++
            totalVotos++
            atualizarResumo()
        }

        btnVotoSalah.setOnClickListener {
            votosSalah++
            totalVotos++
            atualizarResumo()
        }

        btnVotoBranco.setOnClickListener {
            votosBranco++
            totalVotos++
            atualizarResumo()
        }

        btnVotoNulo.setOnClickListener {
            votosNulo++
            totalVotos++
            atualizarResumo()
        }

    }//fim oncreate

    private fun atualizarResumo() {

        val total = if (totalVotos == 0) 1 else totalVotos

        val percDembele = (votosDembele * 100) / total
        val percYamal = (votosYamal * 100) / total
        val percVitinha = (votosVitinha * 100) / total
        val percRaphinha = (votosRaphinha * 100) / total
        val percSalah = (votosSalah * 100) / total
        val percBranco = (votosBranco * 100) / total
        val percNulo = (votosNulo * 100) / total

        votosDembeleText.text = "Dembélé: $votosDembele // $percDembele%"
        votosYamalText.text = "Yamal: $votosYamal // $percYamal%"
        votosVitinhaText.text = "Vitinha: $votosVitinha // $percVitinha%"
        votosRaphinhaText.text = "Raphinha: $votosRaphinha // $percRaphinha%"
        votosSalahText.text = "Salah: $votosSalah // $percSalah%"
        votosBrancoText.text = "Branco: $votosBranco // $percBranco%"
        votosNuloText.text = "Nulo: $votosNulo // $percNulo%"
        totalVotosText.text = "Total de votos: $totalVotos"
    }

}//fim codigo