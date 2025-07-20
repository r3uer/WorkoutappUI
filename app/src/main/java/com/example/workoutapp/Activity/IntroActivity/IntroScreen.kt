package com.example.workoutapp.Activity.IntroActivity

import com.example.workoutapp.R       // ✅ Correct
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun IntroScreen(onStartClick:()->Unit={}) {
    LazyColumn (
        modifier = Modifier
        .fillMaxSize()
            .background(colorResource(id = R.color.mainColor))
                    .padding(WindowInsets.systemBars.asPaddingValues())
    ){
        item {
            IntroHeader()
        }
        item {
            IntroDescription()
        }
        item {
            IntroActionButton(onStartClick)
        }
        item {
            IntroFooter()
        }
    }
}