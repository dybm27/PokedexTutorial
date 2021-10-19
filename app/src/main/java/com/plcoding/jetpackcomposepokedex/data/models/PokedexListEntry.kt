package com.plcoding.jetpackcomposepokedex.data.models

import androidx.compose.ui.graphics.Color
import com.plcoding.jetpackcomposepokedex.ui.theme.lightGrey

data class PokedexListEntry(
    val pokemonName: String,
    val imageUrl: String,
    val number: Int,
    var color: Color = lightGrey
)
