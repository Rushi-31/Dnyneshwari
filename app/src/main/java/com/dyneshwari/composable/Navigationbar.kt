package com.dyneshwari.composable

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dyneshwari.nav.NavItem


@Composable
fun NavigationScreens(navController: NavHostController) {
    NavHost(navController, startDestination = NavItem.Adhayay.path) {
        composable(NavItem.Adhayay.path) { AdhayayList() }
        composable(NavItem.Aarti.path) { Aarti()}
        composable(NavItem.Pasaydaan.path) { Pasaydaan() }
    }
}
