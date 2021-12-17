package com.necatisozer.navigationincompose.ui

import android.content.res.Configuration
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ListItem
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.necatisozer.navigationincompose.data.DataFactory
import com.necatisozer.navigationincompose.data.Movie
import com.necatisozer.navigationincompose.ui.theme.NavigationInComposeTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MovieListScreen(
    onBackClick: () -> Unit,
    onMovieClick: (movieId: String) -> Unit,
    modifier: Modifier = Modifier,
) {
    val movies = DataFactory.movies

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text("Movies")
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                        )
                    }
                },
            )
        }
    ) { innerPadding ->
        LazyColumn(contentPadding = innerPadding) {
            items(movies) { movie ->
                MovieItem(movie, onMovieClick)
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun MovieItem(
    movie: Movie,
    onMovieClick: (movieId: String) -> Unit,
    modifier: Modifier = Modifier,
) {
    ListItem(
        modifier = modifier.clickable {
            onMovieClick(movie.id)
        },
        icon = {
            Image(
                painter = rememberImagePainter(movie.poster),
                contentDescription = null,
                modifier = Modifier.size(64.dp)
            )
        },
        text = { Text(text = movie.name) }
    )
}

@Preview("MovieListScreen")
@Preview("MovieListScreen (dark)", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MovieListScreenPreview() {
    NavigationInComposeTheme {
        MovieListScreen({}, {})
    }
}
