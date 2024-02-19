package com.dyneshwari.composable
import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dyneshwari.PdfActivity
import com.dyneshwari.data.adhyayas
import com.dyneshwari.data.krutidevfontFamily
import com.dyneshwari.ui.theme.Orange


@SuppressLint("SuspiciousIndentation")
//@Preview
    @Composable
    fun AdhayayList(

    )

//
//
    {
    val pdfList = (1..18).map { "adhayay$it.pdf" }
    val context = LocalContext.current
        LazyColumn(
            modifier = Modifier

                .padding(top=70.dp)
//                .width(320.dp)
                .fillMaxWidth(),


            horizontalAlignment = Alignment.CenterHorizontally
        ){
            items(adhyayas.size) { index ->
                val adhyaya = adhyayas[index]
                val pdfPath = pdfList[index] // Get the PDF file path for this card

                AdhayayCard(
                    title = adhyaya,
                    index = index + 1,
                    context = context,
                    onClick = {
                        // Handle click event to open PDF here
                        val intent = Intent(context, PdfActivity::class.java).apply {
                            putExtra("pdfPath", pdfPath)
                        }
                        context.startActivity(intent)
                    }
                )
                Spacer(modifier = Modifier.padding(top=10.dp))
            }
        }
    }

@Composable
@OptIn(ExperimentalMaterial3Api::class)
 fun ToolBar(
    title: String,
    onNavigationClick: () -> Unit,
    onSettingClick: () -> Unit
) {

    TopAppBar(
        // Customize Colors here
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Orange,
            titleContentColor = Color.White,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
            actionIconContentColor = MaterialTheme.colorScheme.onSecondary
        ),
        navigationIcon = {
            IconButton(onClick = onNavigationClick) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Navigation icon"
                )
            }
        },
        title = { Text(
                                    text = title,
                                    fontSize = 30.sp,
                                    fontFamily = krutidevfontFamily,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,

        ) },
        actions = {
            IconButton(onClick = onSettingClick) {
                Icon(
                    Icons.Filled.MoreVert,
                    contentDescription = "more"
                )
            }
        })
}
