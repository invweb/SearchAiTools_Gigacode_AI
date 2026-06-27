package com.zx_tole.myapplication.mvi

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
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
    val state = mutableStateOf(
        AIToolState(
            tools = MockData.aiTools,
            favoriteToolIds = emptySet()
        )
    )

    fun handleIntent(intent: AIToolIntent) {
        state.value = when (intent) {
            is AIToolIntent.SearchQueryChange -> state.value.copy(searchQuery = intent.query)
            is AIToolIntent.CategorySelect -> state.value.copy(selectedCategory = intent.category)
            is AIToolIntent.ToolClick -> state.value.copy(selectedTool = intent.tool)
            AIToolIntent.ToolDismiss -> state.value.copy(selectedTool = null)
            is AIToolIntent.ToggleFavorite -> {
                val newFavoriteIds = if (state.value.favoriteToolIds.contains(intent.tool.id)) {
                    state.value.favoriteToolIds - intent.tool.id
                } else {
                    state.value.favoriteToolIds + intent.tool.id
                }
                state.value.copy(favoriteToolIds = newFavoriteIds)
            }
            is AIToolIntent.NavigationChange -> state.value.copy(currentDestination = intent.destination)
        }
    }
}
