package com.necatisozer.navigationincompose.ui.login

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.necatisozer.navigationincompose.data.DataFactory
import com.necatisozer.navigationincompose.ui.theme.NavigationInComposeTheme

@Composable
fun RegisterScreen(
    onRegisterClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Register")
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
            Button(onClick = {
                DataFactory.isLoggedIn = true
                onRegisterClick()
            }) {
                Text(text = "Register")
            }
        }
    }
}

@Preview("UsernameScreen")
@Preview("UsernameScreen (dark)", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun UsernameScreenPreview() {
    NavigationInComposeTheme {
        UsernameScreen({})
    }
}
