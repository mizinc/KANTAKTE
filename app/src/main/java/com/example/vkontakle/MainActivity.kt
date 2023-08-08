package com.example.vkontakle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.vkontakle.presentation.register_screen.RegisterScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                RegisterScreen()
            }
        }
    }

sealed class NavController(val route: String){
    object Hello: NavController("hello")
    object Googbye: NavController("bye")
}

@Composable
fun Navigation(){
    val controller = rememberNavController()
    NavHost(controller, NavController.Googbye.route) {
        composable(NavController.Hello.route) { Hello(controller) }
        composable(NavController.Googbye.route) {Bye(controller)}
    }
}

@Composable
fun Hello(navHostController: NavHostController){
    Text(text = "hello")
}

@Composable
fun Bye(navHostController: NavHostController){
    Text("bye")
}
