package com.example.workoutapp.MainActivity

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.workoutapp.Model.Workout

@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    workouts: List<Workout>,
){
    Column (
        modifier = modifier.verticalScroll(rememberScrollState())
    ){
        Spacer(Modifier.height(16.dp))
        Header()
        SearchBar()
        Spacer(Modifier.height(16.dp))
        MonitoringSection()
        Spacer(Modifier.height(16.dp))
        BannerCard()
        Spacer(Modifier.height(16.dp))
        OtherWorkouts()
        Spacer(Modifier.height(16.dp))
        WorkoutList(workouts)
    }
}