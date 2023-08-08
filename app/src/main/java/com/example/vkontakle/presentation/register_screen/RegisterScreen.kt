package com.example.vkontakle.presentation.register_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.vkontakle.R
import com.example.vkontakle.presentation.register_screen.components.DefaultVkontakteButton

@Composable
fun RegisterScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.logo), contentDescription = "VkLogo",
                modifier = Modifier.padding(top = 100.dp)
            )
        }
        Column(
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxSize()
        ) {
            DefaultVkontakteButton(text = "Зарегистрироваться", color = Color.Green)
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Уже есть аккаунт?", color = Color.Blue)
                }
                DefaultVkontakteButton(text = "Войти", color = Color(0xFF0077FF))
            }

        }

    }
}