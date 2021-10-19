package com.plcoding.jetpackcomposepokedex.util

import android.graphics.Bitmap
import androidx.compose.ui.graphics.Color
import androidx.palette.graphics.Palette
import coil.bitmap.BitmapPool
import coil.size.Size
import coil.transform.Transformation

class GetColorDominantTransformation(private val onFinish: (Color) -> Unit) : Transformation {

    override fun key(): String = GetColorDominantTransformation::class.java.name

    override suspend fun transform(pool: BitmapPool, input: Bitmap, size: Size): Bitmap {
        Palette.from(input).generate { palette ->
            palette?.dominantSwatch?.rgb?.let { colorValue ->
                onFinish(Color(colorValue))
            }
        }
        return input
    }
}