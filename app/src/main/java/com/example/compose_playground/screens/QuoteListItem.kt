package com.example.compose_playground.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_playground.R

@Composable
fun QuoteListItem(){
    Card(
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                imageVector = Icons.Filled.FormatQuote,
                colorFilter = ColorFilter.tint(Color.Blue),
                contentDescription = "",
                modifier = Modifier
                    .size(50.dp)
                    .rotate(270F)

            )
            Spacer(modifier = Modifier.padding(4.dp))
                Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "This is Quote".repeat(5),
                )
                Box(
                    modifier = Modifier
                        .background(Color(0xFEBBFFEE))
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                )
                Text(
                    text = "Author"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuoteListItemPreview(){
    QuoteListItem()
}