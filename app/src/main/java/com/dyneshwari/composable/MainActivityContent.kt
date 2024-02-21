package com.dyneshwari.composable

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.dyneshwari.R
import com.dyneshwari.data.krutidevfontFamily
import com.dyneshwari.nav.NavItem
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainActivityContent(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {



        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()


        ModalNavigationDrawer(
            drawerContent = {
                DrawerContent(navController)

            },
            drawerState = drawerState
        ) {
            Scaffold(
                topBar = {
                    ToolBar(title = "     श्री ज्ञानेश्वरी", onNavigationClick = {
                        scope.launch {
                            drawerState.open()
                        }
                    }){

                    }
                },
//                bottomBar = {
////                    BottomAppBar { BottomNavigationBar(navController = navController) }
//                },
                content = {
                    NavigationScreens(navController = navController)
                })

                }

        }
    }


@Composable
fun DrawerContent(

  navController: NavHostController

) {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    val navItems = listOf(  NavItem.Adhayay,NavItem.Aarti, NavItem.Pasaydaan)
    var selectedItemIndex by rememberSaveable { mutableStateOf(0) }

    ModalDrawerSheet {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(30.dp))

            Image(
                painter = painterResource(id = R.drawable.mauli),
                contentDescription = "Mauli",
                Modifier.size(200.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "श्री ज्ञानेश्वरी",
                fontFamily = krutidevfontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.padding(top = 5.dp))
            Text(
                text = "  कैवल्य साम्राज्य चक्रवर्ती\nसंतश्रेष्ठ श्री ज्ञानेश्वर महाराज ",
                fontFamily = krutidevfontFamily,
                fontWeight = FontWeight.SemiBold
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
//        BottomNavigationBar(navController = navController)
        navItems.forEachIndexed { index, item ->
            NavigationDrawerItem(
                label = {
                    Text(
                        text = item.title,
                        fontFamily = krutidevfontFamily,
                        fontWeight = FontWeight.Normal
                    )
                },
                selected = index == selectedItemIndex,
                onClick = {
                    selectedItemIndex = index
                    navController.navigate(item.path) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) { saveState = true }
                        }
                        launchSingleTop = true
                        restoreState = true // Update the value of mutable state
                    }
                    // Close the drawer after navigating
                    scope.launch {
                        drawerState.close()
                    }
                }
            )

        }
    }
}
