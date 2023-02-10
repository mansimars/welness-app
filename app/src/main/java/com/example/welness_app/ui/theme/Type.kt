package com.example.welness_app.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.welness_app.R


val siracha = FontFamily(Font(R.font.sriracha_regular))
val noto = FontFamily(Font(R.font.sriracha_regular))
val notoBold = FontFamily(Font(R.font.notosans_bold,FontWeight.Bold))
val notoSemiBold = FontFamily(Font(R.font.notosans_semibold,FontWeight.Bold))

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = noto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    body2 = TextStyle(
        fontFamily = noto,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    ),

    h1 = TextStyle(
        fontFamily = notoBold,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    ),

    h2 = TextStyle(
        fontFamily = notoSemiBold,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */


)



