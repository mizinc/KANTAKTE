package com.example.vkontakle.presentation.messendger_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.vkontakle.R

@Composable
fun MessedgerScreen (navHostController: NavHostController) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "Мессенджер") },
                    navigationIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.profile_photo),
                            contentDescription = null,
                            modifier = Modifier.clip(CircleShape)
                                .border(1.dp, Color.Black)
                        )
                    },
                    backgroundColor = Color.White
                )
            }
        ) {
            Box(modifier = Modifier.padding(it))
        }
}

