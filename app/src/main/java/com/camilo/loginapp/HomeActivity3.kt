package com.camilo.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_home3.*

class HomeActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home3)


        cambiar3()
        atras1()
    }



    private fun cambiar3(){

       BtnTipo3.setOnClickListener {
            val home4Intent=  Intent(this, HomeActivity4::class.java).apply {

            }
            startActivity(home4Intent)


        }
    }

    private fun atras1(){

        BtnAtras2.setOnClickListener {
            val home2Intent=  Intent(this, HomeActivity2::class.java).apply {

            }
            startActivity(home2Intent)


        }
    }




}