package it.wemake.alc4phase1challenge

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context = this as Context
        val gotoAboutALCBTN = findViewById<Button>(R.id.btn_about_alc)

        gotoAboutALCBTN.setOnClickListener {
            val intent = Intent(context, AboutALCActivity::class.java)
            startActivity(intent)
        }

    }
}
