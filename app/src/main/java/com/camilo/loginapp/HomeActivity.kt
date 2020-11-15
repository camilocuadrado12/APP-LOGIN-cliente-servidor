package com.camilo.loginapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //setup
        val bundle = intent.extras
        val email = bundle?.getString("email")


        setup(email?: "")
        cambiar()

    }
    private fun setup(email: String){

        emailTextView.text = email

        title ="setOnClickListener{FirebaseAuth.getInstance().signOut()onBackPressed() }"
    }

private fun cambiar(){

    BtnTipo.setOnClickListener {
        val home2Intent=  Intent(this, HomeActivity2::class.java).apply {

        }
        startActivity(home2Intent)


    }
}




}