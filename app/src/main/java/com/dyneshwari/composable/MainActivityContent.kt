package com.dyneshwari.composable

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainActivityContent(context: Context) {
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background

    ) {
     

        Scaffold(

            topBar = {
                ToolBar(title = "     श्री ज्ञानेश्वरी", onNavigationClick = {


//                        val intent = Intent(context, ::class.java)
//                        context.startActivity(intent)

                 
                }) {

                }
            }

        )
        {
            AdhayayList()
        }
       }
}

