package com.zx_tole.myapplication.mvi

import com.zx_tole.myapplication.data.MockData
import com.zx_tole.myapplication.model.AITool
import com.zx_tole.myapplication.model.Category
import com.zx_tole.myapplication.R

data class AIToolState(
    val searchQuery: String = "",
    val selectedCategory: Category? = null,
    val tools: List<AITool> = emptyList(),
    val favoriteToolIds: Set<Int> = emptySet(),
    val selectedTool: AITool? = null,
    val currentDestination: AppDestinations = AppDestinations.HOME
)

sealed interface AIToolIntent {
    data class SearchQueryChange(val query: String) : AIToolIntent
    data class CategorySelect(val category: Category?) : AIToolIntent
    data class ToolClick(val tool: AITool) : AIToolIntent
    object ToolDismiss : AIToolIntent
    data class ToggleFavorite(val tool: AITool) : AIToolIntent
    data class NavigationChange(val destination: AppDestinations) : AIToolIntent
}

enum class AppDestinations(
    val labelRes: Int,
    val iconRes: Int,
) {
    HOME(R.string.search_placeholder, R.drawable.ic_home),
    FAVORITES(R.string.favorite, R.drawable.ic_favorite),
    PROFILE(R.string.profile, R.drawable.ic_assistant),
}

object AIToolMvi {
    var state: AIToolState = AIToolState(
        tools = MockData.aiTools,
        favoriteToolIds = emptySet()
    )

    fun handleIntent(intent: AIToolIntent) {
        state = when (intent) {
            is AIToolIntent.SearchQueryChange -> state.copy(searchQuery = intent.query)
            is AIToolIntent.CategorySelect -> state.copy(selectedCategory = intent.category)
            is AIToolIntent.ToolClick -> state.copy(selectedTool = intent.tool)
            AIToolIntent.ToolDismiss -> state.copy(selectedTool = null)
            is AIToolIntent.ToggleFavorite -> {
                val newFavoriteIds = if (state.favoriteToolIds.contains(intent.tool.id)) {
                    state.favoriteToolIds - intent.tool.id
                } else {
                    state.favoriteToolIds + intent.tool.id
                }
                state.copy(favoriteToolIds = newFavoriteIds)
            }
            is AIToolIntent.NavigationChange -> state.copy(currentDestination = intent.destination)
        }
    }
}
