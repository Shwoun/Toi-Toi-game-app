package com.example.playtocrypto

import android.app.Activity
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.playtocrypto.bar.BottomBar
import com.example.playtocrypto.navigat.MainNavgrap
import com.example.playtocrypto.navigat.Screen
import com.example.playtocrypto.ui.theme.Backround
import com.example.playtocrypto.viewmodel.Auth
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun AllScreen(navController: NavHostController,Auth: Auth) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val context = LocalContext.current

    val systemUiController = rememberSystemUiController()
    var lastBackPressedTime by remember { mutableLongStateOf(0L) }

    // 🔙 Back press handler


    // System UI কন্ট্রোল
    SideEffect {
        // Transparent করে দিতে হবে
        systemUiController.setStatusBarColor(Color.Transparent)
        systemUiController.setNavigationBarColor(Color.Transparent)

        systemUiController.isStatusBarVisible = false
        systemUiController.isNavigationBarVisible = false

        // Gesture navigation এর জন্য
        systemUiController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    }
    Scaffold(
        modifier = Modifier.fillMaxSize(),


        bottomBar = {
            if (
                currentRoute in listOf(
                    Screen.Home.route,
                    Screen.Payout.route,
                    Screen.Profile.route

                )
            ){
                BottomBar (navController)
            }

        }

    ) { innerPadding ->

        Box(modifier = Modifier
            .fillMaxSize()
            .background(Backround)
            .padding(innerPadding)) {

            MainNavgrap(navController,Auth)
        }

    }

}