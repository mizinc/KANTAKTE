package com.example.vkontakle.presentation.select_birth_date_screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vkontakle.presentation.components.DefaultVkontakteButton
import com.example.vkontakle.presentation.components.VkConnectToolbar
import com.example.vkontakle.ui.theme.QuickSand
import com.example.vkontakle.ui.theme.SuperGrayColor
import com.example.vkontakle.ui.theme.VkColor

@Composable
fun SelectBirthDateScreen(navHostController: NavHostController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        VkConnectToolbar(navHostController = navHostController)
        Text(
            text = "День рождения",
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            fontFamily = QuickSand,
            modifier = Modifier.padding(15.dp)
        )
        Text(
            text = "Зная дату рождения, мы сможем",
            color = Color.Gray,
            modifier = Modifier.padding(start=25.dp, end=21.dp),
            fontSize = 18.sp
        )
        Text(
            text = "подобрать более интересные материалы",
            color = Color.Gray,
            modifier = Modifier.padding(start=25.dp, end=25.dp),
            fontSize = 18.sp
        )
        Text(
            text = "для вас",
            color = Color.Gray,
            modifier = Modifier.padding(start=25.dp, end=25.dp),
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 5.dp, end = 5.dp),
            shape = RoundedCornerShape(20),
            colors = ButtonDefaults.buttonColors(SuperGrayColor)
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(text = "Выберите дату", color = Color.Gray, fontFamily = QuickSand, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.size(150.dp))
                Icon(Icons.Default.ArrowBack, "select_date", tint = Color.Gray)
            }
        }
        Spacer(modifier = Modifier.height(450.dp))
        DefaultVkontakteButton(text = "Далее", color = VkColor) {

        }
    }
}