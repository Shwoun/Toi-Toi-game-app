package com.example.playtocrypto.navigat

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.playtocrypto.viewmodel.Auth

@Composable
fun MainNavgrap(navController: NavHostController,Auth: Auth) {

    NavHost(
        navController = navController,
        startDestination = if (Auth.current != null) Screen.Home.route else Screen.Login.route,
        enterTransition = { fadeIn(tween(10)) },
        exitTransition = { fadeOut(tween(1)) }) {


        homeNavGraph(navController)
        authNavGraph(navController,Auth)
    }


}