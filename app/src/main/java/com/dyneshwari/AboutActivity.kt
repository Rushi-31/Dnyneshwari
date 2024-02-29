package com.dyneshwari

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dyneshwari.data.krutidevfontFamily
import com.dyneshwari.ui.theme.DyneshwariTheme

class AboutActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DyneshwariTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    AboutUs()
                }
            }
        }
    }
}

@Composable
fun AboutUs() {
    Column( modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally    ) {
        Spacer(modifier = Modifier.height(300.dp))
        Image(
            painter = painterResource(id = R.drawable.pandurang), contentDescription = "hari",
            Modifier.size(300.dp),

            )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = " पुंडलिक वरदे हरी विठ्ठल," + " श्री ज्ञानदेव तुकाराम," + " पंढरीनाथ महाराज की जय ।।",
            fontFamily = krutidevfontFamily,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp),
            fontSize = 18.sp,
            textAlign = TextAlign.Center

        )
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(
                text = "माउली चरणी समर्पीत🙏",
                fontFamily = krutidevfontFamily,
                fontWeight = FontWeight.Normal
            )
            Text(text = "© 2024 rushipc@gmail.com", textAlign = TextAlign.Start, fontSize = 10.sp)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview2() {
    DyneshwariTheme {
        AboutUs()
    }
}