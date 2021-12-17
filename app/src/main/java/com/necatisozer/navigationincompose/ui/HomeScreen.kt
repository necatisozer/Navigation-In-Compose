package com.necatisozer.navigationincompose.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.necatisozer.navigationincompose.data.DataFactory
import com.necatisozer.navigationincompose.ui.theme.NavigationInComposeTheme

@Composable
fun HomeScreen(
    onMoviesClick: () -> Unit,
    onLoginClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val isLoggedIn = DataFactory.isLoggedIn
    val username = DataFactory.username

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Home")
                },
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            if (isLoggedIn) {
                Text(text = "Hello $username!")
            } else {
                Button(onClick = onLoginClick) {
                    Text(text = "Login")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = onMoviesClick) {
                Text(text = "Movies")
            }
        }
    }
}

@Preview("HomeScreen")
@Preview("HomeScreen (dark)", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun HomeScreenPreview() {
    NavigationInComposeTheme {
        HomeScreen({}, {})
    }
}
