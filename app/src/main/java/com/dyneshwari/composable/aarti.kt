package com.dyneshwari.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dyneshwari.data.krutidevfontFamily


@Preview
@Composable
fun Aarti() {
    Surface(modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
        ) {


        Column(
            modifier = Modifier
                .padding(top = 100.dp)
                .padding(horizontal = 38.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "श्रीज्ञानदेवाची आरती",
                    fontFamily = krutidevfontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,


                    textDecoration = TextDecoration.Underline
                )
            }
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                "आरती ज्ञानराजा A महाकैवल्यतेजा A सेविती साधुसंत A मनु वेधला माझा A\n" +
                        "आरती ज्ञानराजा AA धृ० AA\n" +
                        "\n" +
                        "लोपलें ज्ञान जगीं A हित नेणती कोणी A अवतार पांडुरंग A\n" +
                        "नाम ठेविलें ज्ञानी AA १ AA\n" +
                        "\n" +
                        "कनकाचे ताट करीं A उभ्या गोपिका नारी A नारद तुंबरही A\n" +
                        "साम गायन करी AA २ AA\n" +
                        "\n" +
                        "प्रगट गुह्य बोले A विश्व ब्रह्याचे केलें A रामा जनार्दनी A\n" +
                        "पायीं मस्तक ठेविलें AA ३ AA",
                fontFamily = krutidevfontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 25.sp,
                lineHeight = 40.sp, // Adjust line height as needed

                textAlign = TextAlign.Center, // Center align the text
                modifier = Modifier.fillMaxWidth() // Occupy full width
            )
        }
    }
}