package com.example.playtocrypto.navigat

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun MainNavgrap(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Login.route,
        enterTransition = { fadeIn(tween(10)) },
        exitTransition = { fadeOut(tween(1)) }) {


        homeNavGraph(navController)
        authNavGraph(navController)
    }


}