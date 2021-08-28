package com.mobarok.composeui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ArtistCard()
        }

    }

    @Preview
    @Composable
    fun ArtistCard() {
        Column {
            Text("Alfred Sisley",style = h1)
            Text("3 minutes ago")
            MyBox()
        }

    }

    @Composable
    fun MyBox(){
        Row{
           Button(
               onClick = {

               },

           )
           {
                Text(text = "Click")
           }
        }
    }


}

val h1 = TextStyle(
    fontSize = 18.sp,
    fontWeight = FontWeight.Bold
)