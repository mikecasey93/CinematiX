package com.kryptopass.common.nav

import androidx.compose.foundation.interaction.PressInteraction

data class MovieInput(
    val movieId: Int?,
    val title: String?,
    val overview: String?,
    val releaseDate: String?,
    val backdropPath: String?
)