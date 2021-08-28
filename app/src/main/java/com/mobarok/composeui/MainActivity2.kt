package com.mobarok.composeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mobarok.composeui.ui.theme.ComposeUiTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUiTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android","mobarok")
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String, b: String) {

    Column(Modifier.padding(all = 20.dp)) {
        Text(text = "Hello $name")
        Text(text = "Hello  $b")
        Text(text = "Hello  $b")
        Text(text = "Hello  $b")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeUiTheme {
        Greeting("Android","mobarok masum")
    }
}