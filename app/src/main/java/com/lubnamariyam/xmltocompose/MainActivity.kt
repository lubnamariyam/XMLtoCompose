package com.lubnamariyam.xmltocompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.ui.res.painterResource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        composeView.setContent {
            Text(text = "Hello Compose View")
        }
    }
}