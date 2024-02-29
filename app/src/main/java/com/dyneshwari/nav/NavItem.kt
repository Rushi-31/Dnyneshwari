package com.dyneshwari.nav

import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import com.dyneshwari.R
import com.dyneshwari.data.NavigationItem
import com.dyneshwari.nav.NavTitle.ADHAYAY


sealed class NavItem {
    object Adhayay :
        Item(
            path = NavPath.ADHAYAYS.toString(),
            title = NavTitle.ADHAYAY,
            selectedIcon  = R.drawable.outlined_book,
            size = 50,
            padding = 5,

        )
    object Aarti :
        Item(
            path = NavPath.AARTI.toString(),
            title = NavTitle.AARTI,
            selectedIcon =  R.drawable.lotusblack,
            size = 35,
            padding = 10,
        )
    object Pasaydaan :
        Item(
            path = NavPath.PASAYDAAN.toString(),
            title = NavTitle.PASAYDAAN,
            selectedIcon = R.drawable.prayerdark,
            size = 35,
            padding = 10,

        )
object About:
        Item(
            path = NavPath.ABOUT.toString(),
            title =" ",
            selectedIcon = R.drawable.pandurang,
            size = 35,
            padding = 10
        )

}