package com.dyneshwari.composable
//import androidx.compose.foundation.verticalScroll
import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dyneshwari.data.Content
import com.dyneshwari.data.krutidevfontFamily
import com.dyneshwari.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable


fun AdhayayCard(title: String, index: Int, context: Context, onClick: () -> Unit) {
    ElevatedCard(
        onClick = onClick,
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Orange),
        modifier = Modifier
            .height(50.dp)
            .width(350.dp)
    ) {
        Row(
            Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontFamily = krutidevfontFamily,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

//@Composable
//fun NavigationScreens(navController: NavHostController) {
//    NavHost(navController, startDestination =Content.DYNESHWARI.toString()) {
//        composable(Content.PASAYDAAN.toString()) { Pasaydaan() }
//        composable(Content.AARTI.toString()) { Aarti() }
//        composable(Content.DYNESHWARI.toString()) { AdhayayList() }
//    }
//}



