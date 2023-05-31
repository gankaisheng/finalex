package com.example.finalexam

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateIntOffsetAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.finalexam.ui.theme.顔愷升Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            顔愷升Theme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier.fillMaxSize(),// 最大化
                    verticalArrangement = Arrangement.Center, // 垂直置中
                    horizontalAlignment = Alignment.CenterHorizontally // 水平置中
                ) {
                    Greeting("作者：411025198 顏愷升")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column() {
        Text(text = "$name", textAlign = TextAlign.Center,)
    }

    Column() {

            Image(

                painter = painterResource(id = R.drawable.map),

                contentDescription = "map2",

                alpha = 1.0f,

                modifier = Modifier)


    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    顔愷升Theme {
        Greeting("Android")
    }
}