package com.example.vkontakle.presentation.select_birth_date_screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vkontakle.presentation.components.VkConnectToolbar
import com.example.vkontakle.ui.theme.QuickSand

@OptIn(ExperimentalMaterialApi::class)
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
        Box(
            modifier = Modifier.fillMaxWidth()
                .wrapContentSize(Alignment.TopEnd)
        ) {
            IconButton(onClick = {  }) {
                Icon(Icons.Default.MoreVert, contentDescription = "Показать меню")
            }
            ExposedDropdownMenuBox(
                onExpandedChange = {},
                expanded = true
            ) {}
        }
    }
}