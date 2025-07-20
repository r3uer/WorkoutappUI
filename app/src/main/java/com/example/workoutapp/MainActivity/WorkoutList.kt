package com.example.workoutapp.MainActivity

import android.os.strictmode.UntaggedSocketViolation
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import com.example.workoutapp.R
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.workoutapp.Model.Workout

@Composable
fun WorkoutList(workouts: List<Workout>){
    val context = LocalContext.current
    LazyRow(
        contentPadding = PaddingValues(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(workouts){workouts->
            WorkoutCard(workouts){

            }
        }
    }
}


@Composable
fun WorkoutCard(workout: Workout, onClick: () -> Unit) {
    val context = LocalContext.current
    val resId = remember(workout.picPath) {
        context.resources.getIdentifier(
            workout.picPath,
            "drawable",
            context.packageName
        )
    }

    Column(
        modifier = Modifier
            .width(250.dp) // 📦 wider card
            .height(260.dp) // 📏 slightly taller
            .clip(RoundedCornerShape(12.dp))
            .background(colorResource(R.color.darkBlue))
            .clickable { onClick() }
            .padding(10.dp)
    ) {
        Image(
            painter = painterResource(resId),
            contentDescription = workout.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp) // 🖼 taller image
                .clip(RoundedCornerShape(10.dp))
        )

        Text(
            text = workout.title,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp, // 🔠 increased title font size
            modifier = Modifier
                .padding(top = 10.dp, start = 4.dp)
        )

        WorkoutInfoRow(workout = workout)
    }
}


@Composable
fun WorkoutInfoRow(workout: Workout) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(start = 4.dp, top = 6.dp)
    ) {
        Text(text = workout.durationAll, color = Color.White, fontSize = 14.sp)
        Text(text = " . ", color = colorResource(R.color.orange), fontSize = 14.sp)
        Text(text = "${workout.lessions.size} Exercise", color = Color.White, fontSize = 14.sp)
        Text(text = " . ", color = colorResource(R.color.orange), fontSize = 14.sp)
        Text(text = "${workout.kcal} kcal", color = Color.White, fontSize = 14.sp)
    }
}

