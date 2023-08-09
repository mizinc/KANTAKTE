package com.example.vkontakle.presentation.auth_screen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DefaultVkontakteButton(text: String, color: Color){
    Button(
        modifier = Modifier
                .fillMaxWidth()
                .padding(start = 13.dp, end = 13.dp)
                .height(45.dp),
        colors = ButtonDefaults.buttonColors(color),
        shape = RoundedCornerShape(20),
        onClick = { /*TODO*/ }) {
        Text(text = text, color = Color.White)
    }
}
