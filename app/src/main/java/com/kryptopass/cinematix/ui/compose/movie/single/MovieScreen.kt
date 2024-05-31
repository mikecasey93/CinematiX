package com.kryptopass.cinematix.ui.compose.movie.single

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.kryptopass.common.nav.MovieInput

@Composable
fun MovieScreen(
    viewModel: MovieViewModel,
    input: MovieInput
) {
    val baseImagePath = "https://image.tmdb.org/t/p/w185/"
    val image = baseImagePath + input.backdropPath

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            contentDescription = null,
            painter = rememberAsyncImagePainter(model = image),
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(150.dp).fillMaxWidth()
        ) 

        Text(
            text = "Movie Details Screen",
            style = MaterialTheme.typography.headlineMedium
        )
    }
}