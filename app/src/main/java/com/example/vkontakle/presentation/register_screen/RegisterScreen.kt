package com.example.vkontakle.presentation.register_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vkontakle.R
import com.example.vkontakle.presentation.auth_screen.components.DefaultVkontakteButton
import com.example.vkontakle.ui.theme.QuickSand

@Composable
fun RegisterScreen(navHostController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
           IconButton(onClick = { /*TODO*/ }) {
               Icon(
                   Icons.Default.ArrowBack,
                   "back_to_auth",
                   tint = Color(0xFF0077FF),
                   modifier = Modifier.size(30.dp)
               )
           }
               Image(
                   painter = painterResource(id = R.drawable.vk_connect),
                   contentDescription = "vk_connect_logo",
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(end = 50.dp),
               )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "Введите номер",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                fontFamily = QuickSand,
                modifier = Modifier.padding(15.dp)
            )
            Text(
                text = "Номер вашего телефона будет",
                color = Color.Gray,
                modifier = Modifier.padding(start=25.dp, end=25.dp),
                fontSize = 20.sp
            )
            Text(
                text = "использоваться для авторизации",
                color = Color.Gray,
                modifier = Modifier.padding(start=25.dp, end=25.dp),
                fontSize = 20.sp
            )
            OutlinedTextField(
                value = "",
                label = { Text(text = "Поле ввода номера телефона") },
                onValueChange = {

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            )
        }
        DefaultVkontakteButton(text = "Получить код", color = Color(0xFF0077FF))
    }
}
