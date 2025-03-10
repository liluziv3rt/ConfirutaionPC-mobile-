package com.example.myapplication.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.SplashScreen.SplashScreen
import com.example.myapplication.login.LoginScreen

@Composable
fun NavHost()
{
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash")
    {
        composable("login")
        {
            LoginScreen(navController)
        }
        composable("splash")
        {
            SplashScreen(navController)
        }
    }

}

