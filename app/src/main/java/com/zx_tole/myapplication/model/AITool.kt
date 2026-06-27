package com.zx_tole.myapplication.model

import androidx.annotation.DrawableRes
import com.zx_tole.myapplication.R

data class AITool(
    val id: Int,
    val name: String,
    val description: String,
    val url: String,
    val category: Category
)

enum class Category(val displayNameRes: Int, @DrawableRes val iconRes: Int) {
    TEXT_GENERATION(R.string.text_generation, R.drawable.ic_text_generate),
    IMAGE_GENERATION(R.string.image_generation, R.drawable.ic_image_generate),
    ASSISTANTS(R.string.assistants, R.drawable.ic_assistant);
}
