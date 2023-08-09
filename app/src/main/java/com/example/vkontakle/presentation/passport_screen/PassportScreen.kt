package com.example.vkontakle.presentation.passport_screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import com.example.vkontakle.presentation.components.VkConnectToolbar
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vkontakle.R
import com.example.vkontakle.presentation.components.DefaultVkontakteButton
import com.example.vkontakle.presentation.navigation.NavController
import com.example.vkontakle.ui.theme.QuickSand
import com.example.vkontakle.ui.theme.VkColor


@Composable
fun PassportScreen(navHostController: NavHostController) {
    val name = remember {
        mutableStateOf("")
    }
    val surname = remember {
        mutableStateOf("")
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        VkConnectToolbar(navHostController = navHostController)

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Ваши имя и фамилия",
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            fontFamily = QuickSand,
            modifier = Modifier.padding(15.dp)
        )
        Text(
            text = "Укажите Ваше настоящее имя и",
            fontSize = 18.sp,
            fontFamily = QuickSand,
            color = Color.Gray
        )
        Text(
            text = "добавьте фотографию",
            fontSize = 18.sp,
            fontFamily = QuickSand,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.profile_photo),
            contentDescription = "profile_photo",
            modifier = Modifier
                .clickable {}
                .clip(CircleShape)
                .size(100.dp)
                .shadow(20.dp)
        )
        OutlinedTextField(
            textStyle = TextStyle(fontSize = 22.sp),
            label = { Text("Имя", fontSize = 22.sp) },
            value = name.value,
            onValueChange = {name.value = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = VkColor,
                unfocusedBorderColor = Color.Gray,
                disabledBorderColor = VkColor,
                focusedLabelColor = VkColor,
            ),
        )
        OutlinedTextField(
            textStyle = TextStyle(fontSize = 22.sp),
            label = { Text("Фамилия", fontSize = 22.sp) },
            value = surname.value,
            onValueChange = {surname.value = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = RoundedCornerShape(20),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = VkColor,
                unfocusedBorderColor = Color.Gray,
                disabledBorderColor = VkColor,
                focusedLabelColor = VkColor,
            ),
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                modifier = Modifier
                    .height(45.dp)
                    .width(175.dp),
                colors = ButtonDefaults.buttonColors(VkColor),
                shape = RoundedCornerShape(20),
                onClick = {}) {
                Text(text = "Мужской", color = Color.White, fontWeight = FontWeight.Bold)
            }
            Button(
                modifier = Modifier
                    .height(45.dp)
                    .width(175.dp),
                colors = ButtonDefaults.buttonColors(VkColor),
                shape = RoundedCornerShape(20),
                onClick = {},
                enabled = false,) {
                Text(text = "Женский", color = Color.Gray, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(200.dp))

        DefaultVkontakteButton(text = "Далее", color = VkColor) {
            navHostController.navigate(NavController.SelectBirthDateScreen.route)
        }

    }
}
