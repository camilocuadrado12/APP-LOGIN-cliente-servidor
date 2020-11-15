package com.camilo.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home4.*


class HomeActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home4)




        cambiar4()
        cerrar()
    }



    private fun cambiar4(){

        BtnFin.setOnClickListener {
            val homeIntent=  Intent(this, HomeActivity::class.java).apply {

            }
            startActivity(homeIntent)


        }
    }


    private fun cerrar(){
        BtnCerrar.setOnClickListener {
            val homeIntent=  Intent(this, MainActivity::class.java).apply {

            }
            startActivity(homeIntent)


        }

    }


}