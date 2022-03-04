package com.example.myktordemoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myktordemoapp.navigation.SetUpNavGraph
import com.example.myktordemoapp.ui.theme.MyKtorDemoAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyKtorDemoAppTheme {

                navController = rememberNavController()
                SetUpNavGraph(navController = navController)
            }
        }
    }
}

