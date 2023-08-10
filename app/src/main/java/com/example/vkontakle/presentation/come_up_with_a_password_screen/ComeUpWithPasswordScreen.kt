package com.example.vkontakle.presentation.come_up_with_a_password_screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vkontakle.R
import com.example.vkontakle.presentation.components.DefaultVkontakteButton
import com.example.vkontakle.presentation.components.VkConnectToolbar
import com.example.vkontakle.presentation.navigation.NavController
import com.example.vkontakle.ui.theme.QuickSand
import com.example.vkontakle.ui.theme.VkColor

@Composable
fun ComeUpWithAPasswordScreen(navHostController: NavHostController) {
    val passwordVisibility = remember {
        mutableStateOf(false)
    }
    val icon = if (passwordVisibility.value) {
        painterResource(id = R.drawable.visibility)
    } else{
        painterResource(id = R.drawable.visibility_off)
    }

    val comeUpPassword = remember {
        mutableStateOf("")
    }
    val tryAgainPassword = remember {
        mutableStateOf("")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        VkConnectToolbar(navHostController = navHostController)
        Text(
            text = "Придумайте пароль",
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            fontFamily = QuickSand,
            modifier = Modifier.padding(15.dp)
        )
        Text(
            text = "Чтобы защитить ваш аккаунт,",
            color = Color.Gray,
            modifier = Modifier.padding(start=25.dp, end=21.dp),
            fontSize = 18.sp
        )
        Text(
            text = "придумайте надежный пароль",
            color = Color.Gray,
            modifier = Modifier.padding(start=25.dp, end=25.dp),
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        PasswordTextField(textValue = comeUpPassword, flag = passwordVisibility, icon = icon, label = "Введите пароль")
        PasswordTextField(textValue = tryAgainPassword, flag = passwordVisibility, icon = icon, label = "Повторите пароль")
        Spacer(modifier = Modifier.height(20.dp))
        DefaultVkontakteButton(text = "Далее", color = VkColor) {
            navHostController.navigate(NavController.MainMenuScreen.route)
        }
    }
}

@Composable
internal fun PasswordTextField(
    textValue: MutableState<String>,
    flag: MutableState<Boolean>,
    icon: Painter,
    label: String,
) {
    val passwordVisibility = flag
    val thisTextValue = textValue
    OutlinedTextField(
        value = thisTextValue.value,
        onValueChange = {thisTextValue.value = it },
        label = { Text(text = label)},
        trailingIcon = {
            IconButton(onClick = { passwordVisibility.value = !passwordVisibility.value }) {
                Icon(icon, contentDescription = "visibility_icon")
            }
        },
        visualTransformation = if(passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation(),
        shape = RoundedCornerShape(20),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = VkColor,
            unfocusedBorderColor = Color.Gray,
            disabledBorderColor = VkColor,
            focusedLabelColor = VkColor,
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp)
    )
}

