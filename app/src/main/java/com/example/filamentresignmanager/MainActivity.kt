package com.example.filamentresignmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filamentresignmanager.adapter.model.data.Resin
import com.example.filamentresignmanager.ui.adapter.model.data.Datasource


class MainActivity : AppCompatActivity() {

    val resins: List<Resin> = Datasource().loadResins()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}