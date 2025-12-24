package com.example.playtocrypto.screen.profile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.playtocrypto.R
import com.example.playtocrypto.componat.LocalDimensions
import com.example.playtocrypto.ui.theme.Backround
import com.example.playtocrypto.ui.theme.comla
import com.example.playtocrypto.ui.theme.green
import com.example.playtocrypto.ui.theme.litewihet
import com.example.playtocrypto.ui.theme.with


@OptIn(ExperimentalLayoutApi::class)

@Composable
fun Payout(navController: NavController) {
    val respons = LocalDimensions.current
    var address by remember { mutableStateOf("") }
    var coinConvert by remember { mutableStateOf("") }
    val focusManager = LocalFocusManager.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Backround)
            .padding(respons.dp(12))
            .verticalScroll(rememberScrollState())
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(respons.dp(620)),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(respons.dp(8)),

                ) {
                Text(
                    "Withdrawal of Cryptocurrencies",
                    fontSize = respons.sp(18f),
                    fontWeight = FontWeight.SemiBold,
                    color = with,
                    modifier = Modifier.padding(top = respons.dp(12))
                )

                Spacer(Modifier.height(respons.dp(25)))

                Text("Withdraw Address :", fontSize = respons.sp(14f), color = litewihet)

                Spacer(Modifier.height(respons.dp(12)))

                OutlinedTextField(
                    value = address,
                    onValueChange = { address = it },
                    placeholder = {
                        Text(
                            "Enter Address ",
                            color = litewihet,
                            fontSize = respons.sp(14f), lineHeight = respons.sp(20f)
                        )
                    },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()

                        .height(respons.dp(50)),
                    shape = RoundedCornerShape(respons.dp(12)),
                    textStyle = TextStyle(
                        fontSize = respons.sp(14f),
                        lineHeight = respons.sp(25f),
                        fontWeight = FontWeight.W400,

                        letterSpacing = respons.sp(.9f),

                        ),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Backround,
                        unfocusedBorderColor = litewihet,
                        cursorColor = comla,
                        focusedContainerColor = with,
                        unfocusedTextColor = with,
                        focusedTextColor = Backround
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    )

                )

                Spacer(Modifier.height(respons.dp(9)))
                Text("Select Crypto Currency", color = litewihet, fontSize = respons.sp(14f))
                Spacer(Modifier.height(respons.dp(17)))
                FlowRow(

                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalArrangement = Arrangement.spacedBy(respons.dp(9))

                ) {
                    listButton(image = R.drawable.bitcoin, text = "Bitcoin", color = comla)
                    listButton(image = R.drawable.dollar, text = "USDT", color = comla)
                    listButton(image = R.drawable.trx, text = "Trx", color = comla)
                    listButton(image = R.drawable.dollar, text = "USDT", color = comla)

                }
                Spacer(Modifier.height(respons.dp(20)))

                Text("Points to convet", color = with, fontSize = respons.sp(14f))

                OutlinedTextField(
                    value = coinConvert,
                    onValueChange = { coinConvert = it },
                    placeholder = {
                        Text(
                            "Enter Amount",
                            color = litewihet,
                            fontSize = respons.sp(14f), lineHeight = respons.sp(20f)
                        )
                    },
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(respons.dp(50)),
                    shape = RoundedCornerShape(respons.dp(12)),
                    textStyle = TextStyle(
                        fontSize = respons.sp(14f),
                        lineHeight = respons.sp(25f),
                        fontWeight = FontWeight.W400,

                        letterSpacing = respons.sp(.9f)
                    ),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Backround,
                        unfocusedBorderColor = litewihet,
                        cursorColor = comla,
                        focusedContainerColor = with,
                        unfocusedTextColor = with,
                        focusedTextColor = Backround
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = { focusManager.clearFocus() }
                    ),

                    )
                Spacer(Modifier.height(respons.dp(4)))

                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Minimum : 500 points", color = litewihet, fontSize = respons.sp(12f))


                    VerticalDivider(
                        Modifier
                            .height(respons.dp(16))
                            .padding(start = respons.dp(4), end = respons.dp(4))
                    )
                    Text("Maximum : 10000 points", color = litewihet, fontSize = respons.sp(12f))
                }

                Spacer(Modifier.height(respons.dp(30)))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(respons.dp(12)),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically


                ) {
                    Text("You will receive", color = litewihet, fontSize = respons.sp(14f))
                    Text(
                        "0.000000 Ltc",
                        color = with,
                        fontSize = respons.sp(16f),
                        fontWeight = FontWeight.W600
                    )
                }

                Button(
                    onClick = {}, modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(respons.dp(9)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = green,
                        contentColor = with
                    )
                ) {
                    Text("Withdraw Now", fontSize = respons.sp(15f))
                }


            }
        }


        Spacer(Modifier.height(respons.dp(20)))

        Text("Withdrawal History", color = with, fontSize = respons.sp(18f))
        Spacer(Modifier.height(respons.dp(20)))
        Withdrawallist()
        Spacer(Modifier.height(respons.dp(12)))
        Withdrawallist()
        Spacer(Modifier.height(respons.dp(12)))
        Withdrawallist()
        Spacer(Modifier.height(respons.dp(12)))
        Withdrawallist()
    }
}


@Composable
fun Withdrawallist() {
    val respons = LocalDimensions.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(respons.dp(250)),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
        shape = RoundedCornerShape(respons.dp(15)),
        elevation = CardDefaults.cardElevation(respons.dp(6)),
        border = BorderStroke(respons.dp(1), color = Color.DarkGray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = respons.dp(18),
                    start = respons.dp(12),
                    end = respons.dp(12),
                    bottom = respons.dp(15)
                )
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("USDT", color = litewihet, fontSize = respons.sp(18f))
                Text(
                    "Success",
                    color = green,
                    fontSize = respons.sp(16f),
                    fontWeight = FontWeight.W600
                )
            }
            Spacer(Modifier.height(respons.dp(20)))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Date/Hora:", color = litewihet, fontSize = respons.sp(18f))
                Text("22/08/2025 , 02:01", color = litewihet, fontSize = respons.sp(16f))
            }
            Spacer(Modifier.height(respons.dp(20)))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Point:", color = litewihet, fontSize = respons.sp(18f))
                Text("515", color = litewihet, fontSize = respons.sp(16f))
            }
            Spacer(Modifier.height(respons.dp(20)))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Value:", color = litewihet, fontSize = respons.sp(18f))
                Text("0.0051 USDT", color = litewihet, fontSize = respons.sp(16f))
            }
            Spacer(Modifier.height(respons.dp(20)))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Wallet:", color = litewihet, fontSize = respons.sp(18f))
                Text("rethjrhohoiuyhuhsfuiyf4637rgrg7", color = litewihet, fontSize = respons.sp(14f))
            }
        }
    }

}

@Composable
fun listButton(
    image: Int,
    text: String,
    color: Color
) {
    val respons = LocalDimensions.current

    Button(
        onClick = {},
        modifier = Modifier
            .size(width = respons.dp(100), height = respons.dp(70)),
        shape = RoundedCornerShape(respons.dp(9)),
        colors = ButtonDefaults.buttonColors(containerColor = comla)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = null,
                modifier = Modifier.size(respons.dp(30))
            )
            Text(text, fontSize = respons.sp(15f))

        }

    }


}
