package com.example.workoutapp.MainActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.workoutapp.MainActivity.WorkoutDataProvider.getData
import com.example.workoutapp.ui.theme.WorkoutAppTheme

class MainActivity : ComponentActivity() {
    private val workouts = getData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            Scaffold(
                containerColor = Color(0Xff101322),
                bottomBar = {
                    MainBottomBar()
                }
            ) { innerPadding ->
                MainContent(
                    modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
//                        .padding(WindowInsets.statusBars.asPaddingValues())
                    ,
                    workouts = workouts
                )
            }
        }
    }
}