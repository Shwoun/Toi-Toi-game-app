package com.example.playtocrypto.navigat

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.playtocrypto.AllScreen
import com.example.playtocrypto.bar.BottomBar
import com.example.playtocrypto.screen.Home
import com.example.playtocrypto.screen.auth.Login
import com.example.playtocrypto.screen.auth.SignUp
import com.example.playtocrypto.screen.profile.Payout
import com.example.playtocrypto.screen.profile.Profile

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Home : Screen("home")
    object SignUp : Screen("Singup")
    object BottomBar : Screen("BottomBar")
    object Profile : Screen("Profile")
    object Payout : Screen(" Payout")



}

fun NavGraphBuilder.homeNavGraph(navController: NavController) {
    composable(Screen.Home.route) {
        Home(navController)
    }
    composable(Screen.Profile.route) {
        Profile(navController)
    }

    composable(Screen.Payout.route) {
        Payout(navController)
    }
    composable(Screen.BottomBar.route) { BottomBar(navController) }

}

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    composable(Screen.Login.route) {
        Login(navController)
    }
    composable(Screen.SignUp.route) {
        SignUp(navController)
    }

}