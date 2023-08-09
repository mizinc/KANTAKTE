package com.example.vkontakle.presentation.login_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.vkontakle.R
import com.example.vkontakle.presentation.components.DefaultVkontakteButton
import com.example.vkontakle.presentation.navigation.NavController
import com.example.vkontakle.ui.theme.VkColor

@Composable
fun LoginScreen(navHostController: NavHostController) {
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
            DefaultVkontakteButton(text = "Зарегистрироваться", color = Color.Green) {
                navHostController.navigate(NavController.PhoneVerification.route)
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Уже есть аккаунт?", color = Color.Blue)
                }
                DefaultVkontakteButton(text = "Войти", color = VkColor) {}
            }

        }

    }
}
