package com.bahadireray.androidviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.bahadireray.androidviewbinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
    }

    fun viewChange(view : View){
    /*    println("ViewChange Tıklandı.")
        textView.text="apply plugin: 'kotlin-android-extensions' Kullanarak yapıldı."
        val textView=findViewById<TextView>(R.id.textView)
        textView.text="Merhaba eski düzen" */
        binding.textView.text="Merhaba Bu yazı View Binding \n kullanımı yapılarak yazıldı"
    }
}