package com.example.coffeshops_pps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.coffeshops_pps.ui.theme.CoffeShops_PPSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeShops_PPSTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),

                    )
                {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "CoffeShops") {
                        composable("CoffeShops") { CoffeShops(navController) }
                        composable(
                            route = "Opiniones/{nameCoffe}",
                            arguments = listOf(navArgument("nameCoffe") {
                                type = NavType.StringType
                            })
                        ) { backStackEntry ->
                            Opiniones(
                                backStackEntry.arguments?.getString("nameCoffe") ?: "",
                                navController
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoffeShops_PPSTheme {
    }
}