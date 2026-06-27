package com.zx_tole.myapplication.data

import com.zx_tole.myapplication.model.AITool
import com.zx_tole.myapplication.model.Category

object MockData {
    val aiTools: List<AITool> = listOf(
        // Text Generation
        AITool(1, "ChatGPT", "Popular chatbot based on GPT for conversation and text generation", "https://chat.openai.com", Category.TEXT_GENERATION),
        AITool(2, "Claude", "AI from Anthropic, focused on safety", "https://claude.ai", Category.TEXT_GENERATION),
        AITool(3, "Gemini", "Multifunctional AI from Google for text, code, and images", "https://gemini.google.com", Category.TEXT_GENERATION),
        AITool(4, "GitHub Copilot", "AI programming assistant from Microsoft", "https://github.com/features/copilot", Category.TEXT_GENERATION),
        
        // Image Generation
        AITool(5, "Midjourney", "Generate images from text description", "https://www.midjourney.com", Category.IMAGE_GENERATION),
        AITool(6, "DALL-E", "Create images using neural network from OpenAI", "https://openai.com/dall-e", Category.IMAGE_GENERATION),
        AITool(7, "Stable Diffusion", "Open-source engine for image generation", "https://stability.ai", Category.IMAGE_GENERATION),
        
        // Assistants
        AITool(8, "ChatGPT", "Chatbot for conversation and task solving", "https://chat.openai.com", Category.ASSISTANTS),
        AITool(9, "Claude", "Helper for text analysis and idea generation", "https://claude.ai", Category.ASSISTANTS),
        AITool(10, "Gemini", "Universal assistant from Google", "https://gemini.google.com", Category.ASSISTANTS),
        AITool(11, "GitHub Copilot", "AI programmer for code autocompletion", "https://github.com/features/copilot", Category.ASSISTANTS),
        AITool(12, "Tabnine", "AI assistant for developers focused on code", "https://www.tabnine.com", Category.ASSISTANTS)
    )
}
