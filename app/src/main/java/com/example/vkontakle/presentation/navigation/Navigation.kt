package com.example.vkontakle.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vkontakle.presentation.login_screen.LoginScreen
import com.example.vkontakle.presentation.passport_screen.PassportScreen
import com.example.vkontakle.presentation.phone_verification_screen.PhoneVerificationScreen

sealed class NavController(val route: String){
    object LoginScreen: NavController("login")
    object PhoneVerification: NavController("phone_verification")
    object PassportScreen: NavController("passport")
}

@Composable
fun Navigation(){
    val controller = rememberNavController()
    NavHost(controller, NavController.LoginScreen.route) {
        composable(NavController.LoginScreen.route) { LoginScreen(controller) }
        composable(NavController.PhoneVerification.route) { PhoneVerificationScreen(controller) }
        composable(NavController.PassportScreen.route) { PassportScreen(controller)}
    }
}