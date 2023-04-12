package com.example.dictionaryapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dictionaryapp.ui.theme.DictionaryAppTheme
import kotlinx.coroutines.delay

class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DictionaryAppTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Greeting(name = "abc")
                    val mContext = LocalContext.current
                    Handler(Looper.getMainLooper()).postDelayed({
                        val intent = Intent(mContext, MainActivity::class.java)
                        startActivity(intent)
                        finish()
                    }, 1500)


                   // mContext.startActivity(Intent(mContext, MainActivity::class.java))

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Image(
        painter = painterResource(id = R.drawable.dictionary),
        contentDescription = null,
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DictionaryAppTheme {
        Greeting("Android")
    }
}