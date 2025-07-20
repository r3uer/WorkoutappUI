package com.example.workoutapp.Activity.IntroActivity

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.workoutapp.R

@Composable
@Preview
fun IntroDescription(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Text(text = "PUSH YOURSELF\n TO THE LIMIT",
            color = colorResource(id = R.color.white),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )
        Text(text = stringResource(R.string.intro_desc),
            color = colorResource(id = R.color.white),
            fontSize = 17.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth().padding(horizontal = 16.dp)
        )
    }
}