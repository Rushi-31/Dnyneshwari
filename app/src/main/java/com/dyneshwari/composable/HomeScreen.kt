package com.dyneshwari.composable

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dyneshwari.AboutActivity
import com.dyneshwari.PdfActivity
import com.dyneshwari.data.adhyayas
import com.dyneshwari.data.krutidevfontFamily
import com.dyneshwari.ui.theme.Orange


@SuppressLint("SuspiciousIndentation")

@Composable
@Preview
fun AdhayayList() {
    val pdfList = (1..18).map { "adhayay$it.pdf" }

    val context = LocalContext.current
    LazyColumn(
        modifier = Modifier


//                .width(320.dp)
            .fillMaxWidth(),


        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Spacer(modifier = Modifier.height(75.dp))
        }
        items(adhyayas.size) { index ->

            val adhyaya = adhyayas[index]

            AdhayayCard(
                title = adhyaya
            ) {
                // Handle click event to open PDF here
                val intent = Intent(context, PdfActivity::class.java).apply {
                    val pdfPath = pdfList[index]
                    putExtra("pdfPath", pdfPath)

                }
                context.startActivity(intent)
            }
            Spacer(modifier = Modifier.padding(top = 10.dp))
        }
        item {
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ToolBar(
    title: String,
    onNavigationClick: () -> Unit,



) {
    var expanded by remember { mutableStateOf(false) }
    var context = LocalContext.current

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
        title = {
            Text(
                text = title,
                fontSize = 30.sp,
                fontFamily = krutidevfontFamily,
                color = Color.White,
                fontWeight = FontWeight.Bold,

                )
        },
        actions = {
            IconButton(onClick = {
                expanded = !expanded
            }) {
                Icon(
                    Icons.Filled.MoreVert,
                    contentDescription = "more"
                )
                DropdownMenu(expanded = expanded, onDismissRequest = {
                    expanded = false

                }) {
                    Text(text = "About Us",
                        modifier = Modifier.clickable {
                            expanded = false
                            val intent = Intent(context, AboutActivity::class.java)
                            context.startActivity(intent)

                        })
                }


            }
        }
    )
}
