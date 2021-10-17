package com.plcoding.jetpackcomposepokedex

import android.os.Parcelable
import androidx.compose.ui.graphics.Color
import kotlinx.parcelize.Parcelize

@Parcelize
data class ColorSaveable(
    val color:Color
):Parcelable