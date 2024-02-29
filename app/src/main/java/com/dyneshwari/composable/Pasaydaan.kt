    package com.dyneshwari.composable

    import androidx.compose.foundation.border
    import androidx.compose.foundation.layout.Box
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.Row
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.layout.height
    import androidx.compose.foundation.layout.padding
    import androidx.compose.foundation.layout.width
    import androidx.compose.foundation.shape.CircleShape
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.material3.MaterialTheme
    import androidx.compose.material3.Surface
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.text.style.TextAlign
    import androidx.compose.ui.text.style.TextDecoration
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import com.dyneshwari.data.krutidevfontFamily
    import com.dyneshwari.ui.theme.Orange

    @Preview
    @Composable
    fun Pasaydaan() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        )
        {
           Column(
               horizontalAlignment = Alignment.CenterHorizontally
           ){
               Spacer(modifier = Modifier.height(40.dp))
               Box(  modifier = Modifier

                   .border(2.dp, color = Orange, shape = RoundedCornerShape(30.dp))
                   .width(350.dp),



){
           Column(modifier = Modifier.fillMaxWidth().padding(15.dp)) {

               Text(
                   text = "पसायदान",
                   fontFamily = krutidevfontFamily,
                   fontWeight = FontWeight.Bold,
                   fontSize = 25.sp,
                   textAlign = TextAlign.Center,
                   textDecoration = TextDecoration.Underline,
                   modifier = Modifier.fillMaxWidth()
               )


               Spacer(modifier = Modifier.height(20.dp))

               Text(
                   text = "आतां विश्वात्मके देवे, येणे वाग्यज्ञे तोषावे,\n" +
                           "तोषोनि मज द्यावे, पसायदान हे AA१AA\n" +
                           "\n" +
                           "जे खळांचि व्यंकटी सांडो, तया सत्कर्मी रती वाढो,\n" +
                           "भूतां परस्परे जडो, मैत्र जीवांचे AA२AA\n" +
                           "\n" +
                           "दुरितांचे तिमिर जावो, विश्व स्वधर्म सूर्ये पाहो,\n" +
                           "जो जे वांछील तो ते लाहो, प्राणिजात AA३AA\n" +
                           "\n" +
                           "वर्षत सकळ मंडळी, ईश्वरनिष्ठांची मांदियाळी,\n" +
                           "अनवरत भूमंडळी, भेटतु भूता AA४AA\n" +
                           "\n" +
                           "चला कल्पतरूंचे आरव, चेतनाचिंतामणींचे गाव,\n" +
                           "बोलती जे अर्णव, पीयूषांचे AA५AA\n" +
                           "\n" +
                           "चन्द्रमेंजे अलांछन, मार्तण्ड जे तापहीन,\n" +
                           "ते सर्वाही सदा सज्जन, सोयरे होतु AA६AA\n" +
                           "\n" +
                           "किंबहुना सर्व सुखी, पूर्ण होवोनि तिहीं लोकी,\n" +
                           "भजिजो आदिपुरुषीं, अखण्डित AA७AA\n" +
                           "\n" +
                           "आणि ग्रंथोपजिवीये, विशेषी लोकी इये,\n" +
                           "दृष्टादृष्टविजये, होआवेजी ॥८॥\n" +
                           "\n" +
                           "येथ म्हणे श्री विश्वेश्वरावो, हा होईल दानपसावो,\n" +
                           "येणे वरे ज्ञानदेवो, सुखिया झाला AA९AA",
                   fontSize = 19.sp,
                   fontFamily = krutidevfontFamily,
                   fontWeight = FontWeight.Normal,
                   textAlign = TextAlign.Center,
                   modifier = Modifier.fillMaxWidth()


                   )
           }

        }
           }
    }
}


