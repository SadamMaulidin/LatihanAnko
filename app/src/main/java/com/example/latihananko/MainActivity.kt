package com.example.latihananko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO Mengoperasikan Button Hello ketika di klik
        btnHello.onClick {
            //Menampilkan widget toast dengan pesannya
            toast("Hello, ${edtNama.text}")
        }
        //TODO mengoperasikan button alert ketika di klik
        btnAlert.onClick {
            //Menampilkan widget alert beserta pilihanyya
            alert("Happy Training" , "Hai, , ${edtNama.text}"){
                //Mengkondisikan ketika user mengklik "OK" atau "No"
                yesButton { toast("Ok, Semangat ya") }
                noButton {}
                //Menampilkan ke layar
            }.show()
        }
           btnShowSelector.onClick {
               val training = listOf("Augmented Reality" , "App Inventor", "Kotlin", "iOT")
               selector("Hi, ${edtNama.text} Apa Materi Yang Kamu Sukai?", training){p, i->
                   toast("Jadi Kamu Menyukai Materi ${training[i]}")
               }
           }
        btnSnackbar.onClick {
            snackbar(edtNama, "Hi, ${edtNama.text}")
        }
        btnProgress.onClick {
            indeterminateProgressDialog("Tungguin Loadingnya Selesai")
        }
        btnSecondActivity.onClick {
            startActivity<Main2Activity>("name" to "${edtNama.text}")
        }
        }
    }

