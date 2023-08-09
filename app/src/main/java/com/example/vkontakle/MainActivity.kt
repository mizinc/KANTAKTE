package com.example.vkontakle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vkontakle.presentation.auth_screen.AuthorizationScreen
import com.example.vkontakle.presentation.register_screen.RegisterScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Navigation()
            }
        }
    }

sealed class NavController(val route: String){
    object AuthorizationScreen: NavController("hello")
    object RegisterScreen: NavController("bye")
}

@Composable
fun Navigation(){
    val controller = rememberNavController()
    NavHost(controller, NavController.AuthorizationScreen.route) {
        composable(NavController.AuthorizationScreen.route) { AuthorizationScreen(controller) }
        composable(NavController.RegisterScreen.route) {RegisterScreen(controller)}
    }
}

