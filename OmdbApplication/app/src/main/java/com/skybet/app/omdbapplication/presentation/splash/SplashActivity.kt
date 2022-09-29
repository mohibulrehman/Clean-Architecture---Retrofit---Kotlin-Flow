package com.skybet.app.omdbapplication.presentation.splash

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import com.skybet.app.omdbapplication.Greeting
import com.skybet.app.omdbapplication.presentation.splash.SplashActivityViewModel
import com.skybet.app.omdbapplication.ui.theme.MyApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : ComponentActivity() {
    private val viewModel: SplashActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }

        /* setContentView(R.layout.activity_main)

         val textView = findViewById<TextView>(R.id.textView1)

         lifecycleScope.launch {
             delay(500)
             viewModel.getSampleResponse()
                 .collect {
                     when (it) {
                         is State.DataState -> textView.text = "success ${it.data}"
                         is State.ErrorState -> textView.text = "error ${it.exception}"
                         is State.LoadingState -> textView.text = "loading"
                     }

                 }
         }*/

    }

    suspend fun getgi(){
        lifecycleScope.launchWhenCreated {  }
    }
}