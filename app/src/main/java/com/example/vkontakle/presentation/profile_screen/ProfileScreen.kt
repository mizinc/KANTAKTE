package com.example.vkontakle.presentation.profile_screen


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.vkontakle.R
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vkontakle.ui.theme.QuickSand
import com.example.vkontakle.ui.theme.VkColor


@Composable
fun ProfileScreen(navHostController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(text="id59901046466", fontFamily = QuickSand, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Укажите короткое имя", color = VkColor, fontFamily = QuickSand)
                    }
                },
                backgroundColor = Color.White,
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painterResource(id = R.drawable.qr_code),
                            contentDescription = "bez_raznici",
                            tint = VkColor,
                            modifier = Modifier.size(30.dp),
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            painterResource(id = R.drawable.menu),
                            contentDescription = "bez_raznici2",
                            tint = VkColor,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }
            )
        }
    ) { Box(modifier = Modifier.padding(it)) }
}
