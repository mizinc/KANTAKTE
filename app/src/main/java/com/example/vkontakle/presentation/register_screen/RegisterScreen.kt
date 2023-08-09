package com.example.vkontakle.presentation.register_screen

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vkontakle.R
import com.example.vkontakle.presentation.auth_screen.components.DefaultVkontakteButton
import com.example.vkontakle.ui.theme.QuickSand
import com.example.vkontakle.ui.theme.VkColor

@Composable
fun RegisterScreen(navHostController: NavHostController) {
    val phoneNumber = remember {
        mutableStateOf("")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
           IconButton(onClick = { /*TODO*/ }) {
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
                modifier = Modifier.padding(start=25.dp, end=21.dp),
                fontSize = 18.sp
            )
            Text(
                text = "использоваться для авторизации",
                color = Color.Gray,
                modifier = Modifier.padding(start=25.dp, end=25.dp),
                fontSize = 18.sp
            )
            OutlinedTextField(
                textStyle = TextStyle(fontSize = 22.sp),
                label = { Text("Номер телефона", fontSize = 22.sp) },
                value = phoneNumber.value,
                onValueChange = {phoneNumber.value = it},
                leadingIcon =
                {
                    Text(
                        text = "+7",
                        color = Color.Black,
                        modifier = Modifier.padding(),
                        fontSize = 22.sp
                    )
                },
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = VkColor,
                    unfocusedBorderColor = VkColor,
                    disabledBorderColor = VkColor,
                    focusedLabelColor = VkColor,
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        DefaultVkontakteButton(text = "Получить код", color = VkColor) {}
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Нажимая на 'Получить код', Вы принимаете",
            color = Color.Gray,
            fontSize = 15.sp
        )
        Row {
            Text(
                text = "пользовательское соглашение",
                color = Color.Gray,
                style = TextStyle(textDecoration = TextDecoration.Underline),
                fontSize = 15.sp
            )
            Text(text = " и политику", color = Color.Gray)
            
        }
        Row {
            Text(
                text = "конфиденциальности",
                color = Color.Gray,
                style = TextStyle(textDecoration = TextDecoration.Underline),
                fontSize = 15.sp
            )
            Text(
                text = " сервиса.",
                color = Color.Gray,
                fontSize = 15.sp
            )
        }
    }
}
