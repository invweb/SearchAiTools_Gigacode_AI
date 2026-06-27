package com.zx_tole.myapplication.data

import com.zx_tole.myapplication.R
import com.zx_tole.myapplication.model.AITool
import com.zx_tole.myapplication.model.Category

object MockData {
    val aiTools: List<AITool> = listOf(
        // Text Generation
        AITool(1, "ChatGPT", "Популярный чат-бот на основе GPT для общения и генерации текста", "https://chat.openai.com", Category.TEXT_GENERATION),
        AITool(2, "Claude", "Искусственный интеллект от Anthropic, ориентированный на безопасность", "https://claude.ai", Category.TEXT_GENERATION),
        AITool(3, "Gemini", "Многофункциональный ИИ от Google для текста, кода и изображений", "https://gemini.google.com", Category.TEXT_GENERATION),
        AITool(4, "GitHub Copilot", "AI-ассистент для программирования от Microsoft", "https://github.com/features/copilot", Category.TEXT_GENERATION),
        
        // Image Generation
        AITool(5, "Midjourney", "Генерация изображений по текстовому описанию", "https://www.midjourney.com", Category.IMAGE_GENERATION),
        AITool(6, "DALL-E", "Создание изображений с помощью нейросети от OpenAI", "https://openai.com/dall-e", Category.IMAGE_GENERATION),
        AITool(7, "Stable Diffusion", "Открытый движок для генерации изображений", "https://stability.ai", Category.IMAGE_GENERATION),
        
        // Assistants
        AITool(8, "ChatGPT", "Чат-бот для общения и решения задач", "https://chat.openai.com", Category.ASSISTANTS),
        AITool(9, "Claude", "Помощник для анализа текстов и генерации идей", "https://claude.ai", Category.ASSISTANTS),
        AITool(10, "Gemini", "Универсальный ассистент от Google", "https://gemini.google.com", Category.ASSISTANTS),
        AITool(11, "GitHub Copilot", "AI-программист для автодополнения кода", "https://github.com/features/copilot", Category.ASSISTANTS),
        AITool(12, "Tabnine", "AI-ассистент для разработчиков с фокусом на код", "https://www.tabnine.com", Category.ASSISTANTS)
    )
}
