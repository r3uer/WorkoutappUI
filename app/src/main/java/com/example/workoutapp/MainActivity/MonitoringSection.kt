package com.example.workoutapp.MainActivity

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.workoutapp.R

@Composable
fun MonitoringSection(){
    Column(
        modifier= Modifier.padding(vertical = 16.dp)
    ) {
        Text(
            text = "Daily Monitoring",
            color= Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 16.dp)
        )
        Spacer(Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            MonitorItem(R.drawable.monitor1,"2550","Daily Calories")
            MonitorItem(R.drawable.monitor2,"6h 45min","Sleep Time")
            MonitorItem(R.drawable.monitor3,"2w 4days","Total Workout")
        }
    }
}

@Composable
fun MonitorItem(icon:Int,value:String,label:String){
    Column(horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            painter = painterResource(id=icon),
            contentDescription = label
        )
        Text(
            text = value,
            color= Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Text(
            text = label,
            color= Color.White,
            fontSize = 12.sp,
            textAlign = TextAlign.Center
        )
    }
}