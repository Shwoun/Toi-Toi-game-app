package com.example.playtocrypto.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.playtocrypto.R
import com.example.playtocrypto.componat.LocalDimensions
import com.example.playtocrypto.ui.theme.Backround
import com.example.playtocrypto.ui.theme.with


@Composable
fun Home(navController: NavController) {
    val respons = LocalDimensions.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Backround)
            .padding(top = respons.dp(12), start = respons.dp(12), end = respons.dp(12))

    ) {
        Text("populer Game", fontSize = respons.sp(22f), color = with)
        Spacer(Modifier.height(respons.dp(12)))

        Hometop_Game_screen()
//        Spacer(Modifier.height(respons.dp(12)))
        val itemsList = (1..10).toList()

        Text("Game List", fontSize = respons.sp(22f), color = with)

        LazyVerticalGrid(
            columns = GridCells.Fixed(2), // 2 column

        ) {


            items(itemsList) { item ->

                GridItem(item)
            }
        }


    }

}

@Composable
fun Hometop_Game_screen() {

    val respons = LocalDimensions.current


        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
                .height(respons.dp(150))
                ,
            shape = RoundedCornerShape(respons.dp(12)),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            contentPadding = PaddingValues(respons.dp(0))
        ) {
            Image(
                painter = painterResource(id = R.drawable.game_photo), // অথবা colorPainter
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop // ইমেজ কিভাবে ফিট হবে
            )
        }




}

@Composable
fun GridItem(number: Int) {

    val respons = LocalDimensions.current

    Button (
        onClick = { /* Handle click event */ },
        modifier = Modifier
            .padding(respons.dp(8))
            .size(width = respons.dp(150), height = respons.dp(200)),
        shape = RoundedCornerShape(respons.dp(12)),
        contentPadding = PaddingValues(respons.dp(0))
        
    ) {
        Image(
            painter = painterResource(id = R.drawable.game_photo), // অথবা colorPainter
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop // ইমেজ কিভাবে ফিট হবে
        )
    }
}
