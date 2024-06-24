package com.example.compose_playground.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun QuoteDetail(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFF141E30),
                        Color(0xFF141E30)
                    )
                )
            )
    ){
        Card(){
            Column(
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    imageVector = Icons.Filled.FormatQuote,
                    contentDescription = null
                )
                Text(
                    text = "This is Quote".repeat(5),
                )
                Spacer(
                    modifier = Modifier
                        .padding(16.dp)
                )
                Text(
                    text = "Author"
                )
            }
        }
    }
}