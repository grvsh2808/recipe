package com.recipe.recipe.repository;


import com.recipe.recipe.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepo extends JpaRepository<Recipe,Long> {
}
