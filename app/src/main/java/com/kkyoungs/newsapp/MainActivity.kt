package com.kkyoungs.newsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tickaroo.tikxml.TikXml
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    private  val retrofit = Retrofit.Builder()
        .baseUrl("https://news.google.com/")
        
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }
}