package com.plcoding.jetpackcomposepokedex.util

import java.util.*

fun String.firstCharCapital(): String =
    this.replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(
            Locale.getDefault()
        ) else it.toString()
    }