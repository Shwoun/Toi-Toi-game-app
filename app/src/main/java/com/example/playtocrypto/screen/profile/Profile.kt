package com.example.playtocrypto.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.playtocrypto.R
import com.example.playtocrypto.componat.LocalDimensions
import com.example.playtocrypto.ui.theme.Backround
import com.example.playtocrypto.ui.theme.Red
import com.example.playtocrypto.ui.theme.litewihet


@Composable
fun Profile(navController: NavController) {
    val respons = LocalDimensions.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Backround)
            .padding(respons.dp(8)),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Card(
            modifier = Modifier.size(respons.dp(100)),
            shape = RoundedCornerShape(respons.dp(90))
        ) { }

        Text(
            "Shwoun Hossen",
            color = litewihet,
            fontSize = respons.sp(18f),
            fontWeight = FontWeight.W600
        )
        Spacer(Modifier.height(respons.dp(4)))
        Text(
            "HossenHossen6378@gmail.com",
            color = litewihet,
            fontSize = respons.sp(18f),
            fontWeight = FontWeight.W600
        )

        Spacer(Modifier.height(respons.dp(7)))

        Button(
            onClick = {},
            modifier = Modifier.size(width = respons.dp(170), height = respons.dp(45)),
            shape = RoundedCornerShape(respons.dp(8)),
            colors = ButtonDefaults.buttonColors(containerColor = Red, contentColor = litewihet)
        ) {
            Text("Edit Profile", fontSize = respons.sp(18f), fontWeight = FontWeight.W600)
        }

        Spacer(Modifier.height(respons.dp(20)))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray,
                contentColor = litewihet
            ),
            shape = RoundedCornerShape(respons.dp(9)),
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(respons.dp(45))
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.wallet),
                        contentDescription = null,
                        modifier = Modifier.size(respons.dp(25))
                    )
                    Spacer(Modifier.width(respons.dp(15)))
                    Text(
                        "Payout",
                        fontSize = respons.sp(18f),
                        fontWeight = FontWeight.W600
                    )
                }

                Image(
                    painter = painterResource(R.drawable.left),
                    contentDescription = null,
                    modifier = Modifier.rotate(180f)
                )
            }


        }
        Spacer(Modifier.height(respons.dp(9)))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray,
                contentColor = litewihet
            ),
            shape = RoundedCornerShape(respons.dp(9)),
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(respons.dp(45))
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.customerservice),
                        contentDescription = null,
                        modifier = Modifier.size(respons.dp(25))
                    )
                    Spacer(Modifier.width(respons.dp(15)))
                    Text(
                        "Customer Service",
                        fontSize = respons.sp(18f),
                        fontWeight = FontWeight.W600
                    )
                }

                Image(
                    painter = painterResource(R.drawable.left),
                    contentDescription = null,
                    modifier = Modifier.rotate(180f)
                )
            }


        }
        Spacer(Modifier.height(respons.dp(9)))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray,
                contentColor = litewihet
            ),
            shape = RoundedCornerShape(respons.dp(9)),
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .height(respons.dp(45))
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.insurance),
                        contentDescription = null,
                        modifier = Modifier.size(respons.dp(25))
                    )
                    Spacer(Modifier.width(respons.dp(15)))
                    Text(
                        "Policey",
                        fontSize = respons.sp(18f),
                        fontWeight = FontWeight.W600
                    )
                }

                Image(
                    painter = painterResource(R.drawable.left),
                    contentDescription = null,
                    modifier = Modifier.rotate(180f)
                )
            }


        }
        Spacer(Modifier.height(respons.dp(30)))
        TextButton(onClick = {}) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(R.drawable.logout),
                    contentDescription = null,
                    modifier = Modifier.size(respons.dp(25)),
                    tint = Red
                )
                Text(
                    "Logout",
                    color = Red,
                    fontSize = respons.sp(18f)
                )

            }


        }

    }


}