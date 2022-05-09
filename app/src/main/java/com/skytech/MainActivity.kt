package com.skytech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.skytech.databinding.ActivityMainBinding
import com.skytechtest.SkyTech
import com.skytechtest.SkyTechActivity

class MainActivity : AppCompatActivity() {
    private lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

       binding.skytech.setOnClickListener {
//           val intent = Intent(this, SkyTechActivity::class.java)
//           startActivity(intent)
           SkyTech.Builder(applicationContext).open(this)
       }

    }
}