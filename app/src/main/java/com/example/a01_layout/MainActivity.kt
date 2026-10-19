package com.example.a01_layout

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        showMainScreen()
    }

    private fun showMainScreen() {
        setContentView(R.layout.activity_main)
        applyWindowInsets(R.id.main)

        findViewById<LinearLayout>(R.id.layoutServiceContact)?.setOnClickListener {
            showContactScreen()
        }
        findViewById<LinearLayout>(R.id.layoutServiceTwitch)?.setOnClickListener {
            Toast.makeText(this, "Abriendo Twitch de Ortizx2...", Toast.LENGTH_SHORT).show()
        }
        findViewById<LinearLayout>(R.id.layoutServiceSocials)?.setOnClickListener {
            Toast.makeText(this, "Abriendo redes sociales de Ortizx2...", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.btnLive)?.setOnClickListener {
            Toast.makeText(this, "¡Conectando con el directo de Ortizx2!", Toast.LENGTH_SHORT).show()
        }
        findViewById<View>(R.id.ivNotification)?.setOnClickListener {
            Toast.makeText(this, "Sin nuevas notificaciones", Toast.LENGTH_SHORT).show()
        }

        findViewById<View>(R.id.navHome)?.setOnClickListener {
            Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show()
        }
        findViewById<View>(R.id.navSchedule)?.setOnClickListener {
            Toast.makeText(this, "Horarios de directos", Toast.LENGTH_SHORT).show()
        }
        findViewById<View>(R.id.navCenter)?.setOnClickListener {
            Toast.makeText(this, "Menú rápido de Ortizx2", Toast.LENGTH_SHORT).show()
        }
        findViewById<View>(R.id.navChat)?.setOnClickListener {
            Toast.makeText(this, "Chat de la comunidad", Toast.LENGTH_SHORT).show()
        }
        findViewById<View>(R.id.navProfile)?.setOnClickListener {
            Toast.makeText(this, "Perfil de Ortizx2", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showContactScreen() {
        setContentView(R.layout.contacto)
        applyWindowInsets(R.id.main)

        findViewById<Button>(R.id.btnSend)?.setOnClickListener {
            Toast.makeText(this, "¡Mensaje simulado enviado a Ortizx2!", Toast.LENGTH_SHORT).show()
            showMainScreen()
        }
        findViewById<Button>(R.id.btnBack)?.setOnClickListener {
            showMainScreen()
        }
    }

    private fun applyWindowInsets(rootId: Int) {
        findViewById<View>(rootId)?.let { v ->
            ViewCompat.setOnApplyWindowInsetsListener(v) { view, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}
