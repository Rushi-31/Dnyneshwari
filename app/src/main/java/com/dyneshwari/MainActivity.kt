package com.dyneshwari

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import com.dyneshwari.composable.MainActivityContent
import com.dyneshwari.ui.theme.DyneshwariTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current
            DyneshwariTheme {
                MainActivityContent(context)

            }
        }
    }
}


