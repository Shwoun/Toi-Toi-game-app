package com.example.playtocrypto.bar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.playtocrypto.R
import com.example.playtocrypto.componat.LocalDimensions
import com.example.playtocrypto.navigat.Screen
import com.example.playtocrypto.ui.theme.PurpleGrey40
import com.example.playtocrypto.ui.theme.with

@Composable
fun BottomBar(

    navController: NavController
) {
    val respons = LocalDimensions.current

    BottomAppBar (

        modifier = Modifier

            .fillMaxWidth()
            .windowInsetsPadding(WindowInsets.navigationBars)
            .height(respons.dp(40))
            ,
        containerColor = PurpleGrey40




    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround

        ) {
            IconButton(
                onClick = {navController.navigate(Screen.Home.route){
                    launchSingleTop = true
                    popUpTo(Screen.Home.route)
                } },
                modifier = Modifier.size(respons.dp(50))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.home),
                    modifier = Modifier.size(respons.dp(30)),
                    contentDescription = "Home",
                    tint = with
                )
            }
            IconButton(
                onClick = { navController.navigate(Screen.Payout.route){
                    launchSingleTop = true
                    popUpTo (Screen.Payout.route)
                } },
                modifier = Modifier.size(respons.dp(50))
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.wallet),
                    modifier = Modifier.size(respons.dp(30)),
                    contentDescription = "wallet",
                    tint = with
                )
            }
            IconButton(
                onClick = { navController.navigate(Screen.Profile.route){
                    launchSingleTop = true
                    popUpTo(Screen.Profile.route)
                } },
                modifier = Modifier.size(respons.dp(50) )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.profil),
                    modifier = Modifier.size(respons.dp(30)),
                    contentDescription = "user",
                    tint = with
                )
            }
        }
    }
}

