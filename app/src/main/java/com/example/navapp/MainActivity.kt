package com.example.navapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navapp.screens.HomeScreen
import com.example.navapp.screens.ProfileScreen
import com.example.navapp.screens.SplashScreen
import com.example.navapp.ui.theme.NavAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "Splash" )
                    {
                        composable(route = "splash"){
                            SplashScreen{
                                navController.navigate("home")
                            }
                        }
                        composable(route="home"){
                            HomeScreen(
                                onBackPressed =  {navController.popBackStack()},
                                onNext = {navController.navigate("profile")}
                            )
                        }
                        composable(route= "profile"){
                            ProfileScreen{
                                navController.popBackStack()

                            }
                        }
                    }

                }
            }
        }
    }
}

