package com.dyneshwari.composable

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dyneshwari.nav.NavItem

//import com.dyneshwari.nav.NavItem


//@Composable
//fun BottomNavigationBar(navController: NavHostController) {
//    val navItems = listOf( NavItem.Aarti,NavItem.Adhayay, NavItem.Pasaydaan)
//    var selectedItem by rememberSaveable { mutableStateOf(1) }
//
//    NavigationBar {
//        navItems.forEachIndexed { index, item ->
//            NavigationBarItem(
//                alwaysShowLabel = true,
//                icon = { Icon(painterResource(id = item.selectedicon), contentDescription = item.title) },
//                label = { Text(item.title) },
//                selected = selectedItem == index,
//                onClick = {
//                    selectedItem = index
//                    navController.navigate(item.path) {
//                        navController.graph.startDestinationRoute?.let { route ->
//                            popUpTo(route) { saveState = true }
//                        }
//                        launchSingleTop = true
//                        restoreState = true
//                    }
//                }
//            )
//        }
//    }
//}
@Composable
fun NavigationScreens(navController: NavHostController) {
    NavHost(navController, startDestination = NavItem.Adhayay.path) {
        composable(NavItem.Adhayay.path) { AdhayayList() }
        composable(NavItem.Aarti.path) { Aarti()}
        composable(NavItem.Pasaydaan.path) { Pasaydaan() }
    }
}
