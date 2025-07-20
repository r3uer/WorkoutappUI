package com.example.workoutapp.Activity.IntroActivity

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.workoutapp.R

@Composable
@Preview
fun IntroActionButton(onStartClick:()->Unit={}){
    Button(
        onClick = onStartClick,
        shape = RoundedCornerShape(100.dp),
        colors = ButtonDefaults
            .buttonColors(containerColor = colorResource(R.color.orange)),
        modifier = Modifier.fillMaxWidth().padding(16.dp).height(50.dp)
    ){
        Text(
            text = "Lets Go",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.white)
        )
    }
}