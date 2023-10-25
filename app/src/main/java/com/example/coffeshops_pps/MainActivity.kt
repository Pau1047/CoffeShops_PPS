package com.example.coffeshops_pps

import androidx.compose.runtime.remember
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.NavType
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
                    NavHost(navController = navController, startDestination = "Coffe") {
                        composable("Coffe") { CoffeShops(navController) }
                        composable(
                            route = "Comentarios/{cafeteriaName}",
                            arguments = listOf(navArgument("cafeteriaName") { type = NavType.StringType })
                        ) { backStackEntry ->
                            Comentarios(backStackEntry.arguments?.getString("cafeteriaName") ?: "", navController)
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
        CoffeShops()
    }
}