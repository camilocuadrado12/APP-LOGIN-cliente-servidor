package com.camilo.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home2.*

class HomeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)


        cambiar2()
        atras()
    }


    private fun cambiar2(){

        BtnTipo2.setOnClickListener {
            val home3Intent=  Intent(this, HomeActivity3::class.java).apply {

            }
            startActivity(home3Intent)


        }
    }

    private fun atras(){

       BtnAtras.setOnClickListener {
            val homeIntent=  Intent(this, HomeActivity::class.java).apply {

            }
            startActivity(homeIntent)


        }
    }



}