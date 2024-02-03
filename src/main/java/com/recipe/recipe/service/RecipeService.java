package com.recipe.recipe.service;

import com.recipe.recipe.payload.RecipeDto;
import org.springframework.http.ResponseEntity;

public interface RecipeService{
public RecipeDto createRecipe(RecipeDto recipeDto);

public RecipeDto getRecipeById(long id);
}
