package com.zx_tole.myapplication.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.zx_tole.myapplication.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

data class AITool(
    val id: Int,
    @StringRes val nameResId: Int,
    @StringRes val descriptionResId: Int,
    val url: String,
    val category: Category
)

enum class Category(val displayNameRes: Int, @DrawableRes val iconRes: Int) {
    TEXT_GENERATION(R.string.text_generation, R.drawable.ic_text_generate),
    IMAGE_GENERATION(R.string.image_generation, R.drawable.ic_image_generate),
    ASSISTANTS(R.string.assistants, R.drawable.ic_assistant);
}
