package com.necatisozer.navigationincompose.ui.login

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.necatisozer.navigationincompose.data.DataFactory
import com.necatisozer.navigationincompose.ui.theme.NavigationInComposeTheme

@Composable
fun UsernameScreen(
    onNextClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Username")
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
            var username by rememberSaveable { mutableStateOf("") }
            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                label = { Text(text = "Username") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {
                DataFactory.username = username
                onNextClick()
            }) {
                Text(text = "Next")
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
