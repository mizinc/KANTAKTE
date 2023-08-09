package com.example.vkontakle.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vkontakle.presentation.come_up_with_a_password_screen.ComeUpWithAPasswordScreen
import com.example.vkontakle.presentation.login_screen.LoginScreen
import com.example.vkontakle.presentation.passport_screen.PassportScreen
import com.example.vkontakle.presentation.phone_verification_screen.PhoneVerificationScreen
import com.example.vkontakle.presentation.select_birth_date_screen.SelectBirthDateScreen

sealed class NavController(val route: String){
    object LoginScreen: NavController("login")
    object PhoneVerification: NavController("phone_verification")
    object PassportScreen: NavController("passport")
    object SelectBirthDateScreen: NavController("birth_date")
    object ComeUpWithAPasswordScreen: NavController("come_up_a_password")
}

@Composable
fun Navigation(){
    val controller = rememberNavController()
    NavHost(controller, NavController.LoginScreen.route) {
        composable(NavController.LoginScreen.route) { LoginScreen(controller) }
        composable(NavController.PhoneVerification.route) { PhoneVerificationScreen(controller) }
        composable(NavController.PassportScreen.route) { PassportScreen(controller)}
        composable(NavController.SelectBirthDateScreen.route) { SelectBirthDateScreen(controller)}
        composable(NavController.ComeUpWithAPasswordScreen.route) { ComeUpWithAPasswordScreen(controller)}
    }
}