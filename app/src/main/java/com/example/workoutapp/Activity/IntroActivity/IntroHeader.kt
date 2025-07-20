package com.example.workoutapp.Activity.IntroActivity

import androidx.compose.foundation.Image
import com.example.workoutapp.R
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun IntroHeader(){
    Image(
        painter = painterResource(R.drawable.intro_pic),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxWidth()
    )
}