package com.example.playtocrypto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.playtocrypto.bar.BottomBar
import com.example.playtocrypto.screen.Home
import com.example.playtocrypto.screen.auth.Login
import com.example.playtocrypto.screen.auth.SignUp
import com.example.playtocrypto.screen.profile.Payout
import com.example.playtocrypto.screen.profile.Profile
import com.example.playtocrypto.ui.theme.PlayToCryptoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                Scaffold(modifier = Modifier.fillMaxSize(),


                        bottomBar = {
                            BottomBar  {}
                        }

                    ) { innerPadding ->
                    Box(modifier = Modifier.fillMaxSize().padding(innerPadding)){

                        Home()
                    }

                }

        }
    }
}

