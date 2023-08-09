package com.example.vkontakle.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.vkontakle.R
import com.example.vkontakle.ui.theme.VkColor

@Composable
fun VkConnectToolbar(navHostController: NavHostController) {
    Row {
        IconButton(onClick = { navHostController.navigateUp() }) {
            Icon(
                Icons.Default.ArrowBack,
                "back_to_auth",
                tint = VkColor,
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
}
