package com.example.vkontakle.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vkontakle.presentation.login_screen.LoginScreen
import com.example.vkontakle.presentation.phone_verification_screen.PhoneVerificationScreen

sealed class NavController(val route: String){
    object AuthorizationScreen: NavController("hello")
    object RegisterScreen: NavController("bye")
}

@Composable
fun Navigation(){
    val controller = rememberNavController()
    NavHost(controller, NavController.AuthorizationScreen.route) {
        composable(NavController.AuthorizationScreen.route) { LoginScreen(controller) }
        composable(NavController.RegisterScreen.route) { PhoneVerificationScreen(controller) }
    }
}