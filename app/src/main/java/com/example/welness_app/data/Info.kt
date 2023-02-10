package com.example.welness_app.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.welness_app.R

data class Info(
    val dayID: String,
    @StringRes val textID: Int,
    @DrawableRes val imageID: Int,
    @StringRes val descID: Int
    )

val infoList = listOf(
    Info("Day 1", R.string.tet_1,R.drawable.image__23_,R.string.tet_1),
    Info("Day 2", R.string.tet_2,R.drawable.image__24_,R.string.tet_6),
    Info("Day 3", R.string.tet_4,R.drawable.image__23_,R.string.tet_16),
    Info("Day 4", R.string.tet_5,R.drawable.image__25_,R.string.tet_11),
    Info("Day 5", R.string.tet_6,R.drawable.image__27_,R.string.tet_8),
    Info("Day 6", R.string.tet_8,R.drawable.image__20_,R.string.tet_18),
    Info("Day 7", R.string.tet_10,R.drawable.image__23_,R.string.tet_9),
    Info("Day 8", R.string.tet_4,R.drawable.image__24_,R.string.tet_10),
    Info("Day 9", R.string.tet_1,R.drawable.image__26_,R.string.tet_13)

)

