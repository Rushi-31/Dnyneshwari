    package com.dyneshwari.composable

    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.Row
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.height
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import com.dyneshwari.data.krutidevfontFamily
    @Preview
    @Composable
    fun Pasaydaan() {
        Column (Modifier

            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally){

Spacer(modifier = Modifier.height(90.dp))
            Row {

            Text(text = "पसायदान", fontFamily = krutidevfontFamily, fontWeight = FontWeight.Bold, fontSize = 20.sp)

            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "आतां विश्वात्मके देवे, येणे वाग्यज्ञे तोषावे,\n" +
                        "तोषोनि मज द्यावे, पसायदान हे ||१||\n" +
                        "\n" +
                        "जे खळांचि व्यंकटी सांडो, तया सत्कर्मी रती वाढो,\n" +
                        "भूतां परस्परे जडो, मैत्र जीवांचे ||२||\n" +
                        "\n" +
                        "दुरितांचे तिमिर जावो, विश्व स्वधर्म सूर्ये पाहो,\n" +
                        "जो जे वांछील तो ते लाहो, प्राणिजात ||३||\n" +
                        "\n" +
                        "वर्षत सकळ मंडळी, ईश्वरनिष्ठांची मांदियाळी,\n" +
                        "अनवरत भूमंडळी, भेटतु भूता ||४||\n" +
                        "\n" +
                        "चला कल्पतरूंचे आरव, चेतनाचिंतामणींचे गाव,\n" +
                        "बोलती जे अर्णव, पीयूषांचे ||५||\n" +
                        "\n" +
                        "चन्द्रमेंजे अलांछन, मार्तण्ड जे तापहीन,\n" +
                        "ते सर्वाही सदा सज्जन, सोयरे होतु ||६||\n" +
                        "\n" +
                        "किंबहुना सर्व सुखी, पूर्ण होवोनि तिहीं लोकी,\n" +
                        "भजिजो आदिपुरुषीं, अखण्डित ||७||\n" +
                        "\n" +
                        "आणि ग्रंथोपजिवीये, विशेषी लोकी इये,\n" +
                        "दृष्टादृष्टविजये, होआवेजी ॥८॥\n" +
                        "\n" +
                        "येथ म्हणे श्री विश्वेश्वरावो, हा होईल दानपसावो,\n" +
                        "येणे वरे ज्ञानदेवो, सुखिया झाला ||९||",
                fontSize = 17.sp
            )

        }
    }
