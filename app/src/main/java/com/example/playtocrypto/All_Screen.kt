package com.example.playtocrypto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.playtocrypto.bar.BottomBar
import com.example.playtocrypto.navigat.MainNavgrap
import com.example.playtocrypto.navigat.Screen
import com.example.playtocrypto.ui.theme.Backround
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun AllScreen(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val systemUiController = rememberSystemUiController()


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

            MainNavgrap(navController)
        }

    }

}