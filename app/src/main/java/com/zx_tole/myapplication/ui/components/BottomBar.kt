package com.zx_tole.myapplication.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.zx_tole.myapplication.mvi.AppDestinations
import com.zx_tole.myapplication.R

@Composable
fun MainBottomBar(
    currentDestination: AppDestinations,
    onDestinationChange: (AppDestinations) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier,
        containerColor = androidx.compose.material3.MaterialTheme.colorScheme.surfaceVariant,
        contentColor = androidx.compose.material3.MaterialTheme.colorScheme.onSurfaceVariant
    ) {
        NavigationBarItem(
            icon = { Icon(painter = painterResource(id = R.drawable.ic_home), contentDescription = null) },
            label = { Text(stringResource(AppDestinations.HOME.labelRes)) },
            selected = currentDestination == AppDestinations.HOME,
            onClick = { onDestinationChange(AppDestinations.HOME) }
        )
        NavigationBarItem(
            icon = { Icon(painter = painterResource(id = R.drawable.ic_favorite), contentDescription = null) },
            label = { Text(stringResource(AppDestinations.FAVORITES.labelRes)) },
            selected = currentDestination == AppDestinations.FAVORITES,
            onClick = { onDestinationChange(AppDestinations.FAVORITES) }
        )
        NavigationBarItem(
            icon = { Icon(painter = painterResource(id = R.drawable.ic_assistant), contentDescription = null) },
            label = { Text(stringResource(AppDestinations.PROFILE.labelRes)) },
            selected = currentDestination == AppDestinations.PROFILE,
            onClick = { onDestinationChange(AppDestinations.PROFILE) }
        )
    }
}
