package com.zx_tole.myapplication.data

import com.zx_tole.myapplication.R
import com.zx_tole.myapplication.model.AITool
import com.zx_tole.myapplication.model.Category

object MockData {
    val aiTools: List<AITool> = listOf(
        // Text Generation
        AITool(
            id = 1,
            nameResId = R.string.chatgpt,
            descriptionResId = R.string.chatgpt_desc,
            url = "https://chat.openai.com",
            category = Category.TEXT_GENERATION
        ),
        AITool(
            id = 2,
            nameResId = R.string.claude,
            descriptionResId = R.string.claude_desc,
            url = "https://claude.ai",
            category = Category.TEXT_GENERATION
        ),
        AITool(
            id = 3,
            nameResId = R.string.gemini,
            descriptionResId = R.string.gemini_desc,
            url = "https://gemini.google.com",
            category = Category.TEXT_GENERATION
        ),
        AITool(
            id = 4,
            nameResId = R.string.github_copilot,
            descriptionResId = R.string.github_copilot_desc,
            url = "https://github.com/features/copilot",
            category = Category.TEXT_GENERATION
        ),
        
        // Image Generation
        AITool(
            id = 5,
            nameResId = R.string.midjourney,
            descriptionResId = R.string.midjourney_desc,
            url = "https://www.midjourney.com",
            category = Category.IMAGE_GENERATION
        ),
        AITool(
            id = 6,
            nameResId = R.string.dalle,
            descriptionResId = R.string.dalle_desc,
            url = "https://openai.com/dall-e",
            category = Category.IMAGE_GENERATION
        ),
        AITool(
            id = 7,
            nameResId = R.string.stable_diffusion,
            descriptionResId = R.string.stable_diffusion_desc,
            url = "https://stability.ai",
            category = Category.IMAGE_GENERATION
        ),
        
        // Assistants
        AITool(
            id = 8,
            nameResId = R.string.chatgpt,
            descriptionResId = R.string.chatgpt_desc,
            url = "https://chat.openai.com",
            category = Category.ASSISTANTS
        ),
        AITool(
            id = 9,
            nameResId = R.string.claude,
            descriptionResId = R.string.claude_desc,
            url = "https://claude.ai",
            category = Category.ASSISTANTS
        ),
        AITool(
            id = 10,
            nameResId = R.string.gemini,
            descriptionResId = R.string.gemini_desc,
            url = "https://gemini.google.com",
            category = Category.ASSISTANTS
        ),
        AITool(
            id = 11,
            nameResId = R.string.github_copilot,
            descriptionResId = R.string.github_copilot_desc,
            url = "https://github.com/features/copilot",
            category = Category.ASSISTANTS
        ),
        AITool(
            id = 12,
            nameResId = R.string.tabnine,
            descriptionResId = R.string.tabnine_desc,
            url = "https://www.tabnine.com",
            category = Category.ASSISTANTS
        )
    )
}
