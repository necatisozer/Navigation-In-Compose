package com.necatisozer.navigationincompose.ui

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.necatisozer.navigationincompose.data.DataFactory
import com.necatisozer.navigationincompose.data.Movie
import com.necatisozer.navigationincompose.ui.theme.NavigationInComposeTheme

@Composable
fun MovieDetailScreen(
    movieId: String,
    showHome: Boolean,
    onBackClick: () -> Unit,
    onHomeClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val movie: Movie? = DataFactory.movies.find { it.id == movieId }

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(text = movie?.name ?: "Failure!")
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                        )
                    }
                },
                actions = {
                    if (showHome) {
                        IconButton(onClick = onHomeClick) {
                            Icon(
                                imageVector = Icons.Default.Home,
                                contentDescription = null,
                            )
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        if (movie != null) {
            MovieContent(movie, Modifier.padding(innerPadding))
        } else {
            ErrorContent(Modifier.padding(innerPadding))
        }
    }
}

@Composable
fun MovieContent(movie: Movie, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = rememberImagePainter(movie.poster),
            contentDescription = null,
            modifier = Modifier.size(256.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = movie.overview, style = MaterialTheme.typography.body1)
    }
}

@Composable
fun ErrorContent(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Movie not found!", color = MaterialTheme.colors.error)
    }
}

@Preview("MovieDetailScreen")
@Preview("MovieDetailScreen (dark)", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MovieDetailScreenPreview() {
    NavigationInComposeTheme {
        MovieDetailScreen("movie1", true, {}, {})
    }
}
