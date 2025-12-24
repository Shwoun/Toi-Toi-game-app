package com.example.playtocrypto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.playtocrypto.componat.ProvideResponsiveDimensions

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


            val navController = rememberNavController()



            ProvideResponsiveDimensions {
                AllScreen(navController)
            }


        }
    }
}

