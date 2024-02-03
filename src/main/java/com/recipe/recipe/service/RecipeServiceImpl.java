package com.recipe.recipe.service;

import com.recipe.recipe.entity.Recipe;
import com.recipe.recipe.payload.RecipeDto;
import com.recipe.recipe.repository.RecipeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService{


    @Autowired
    private ModelMapper mapper;
    @Autowired
    private RecipeRepo recipeRepo;

    @Override
    public RecipeDto createRecipe(RecipeDto recipeDto) {

        Recipe recipe = mapToEntity(recipeDto);
        Recipe savedRecipe = recipeRepo.save(recipe);
        RecipeDto savedDto = mapToDto(savedRecipe);
        return savedDto;
    }

    @Override
    public RecipeDto getRecipeById(long id) {
        Optional<Recipe> byId = recipeRepo.findById(id);
        return mapToDto(byId.get());

    }

    public Recipe mapToEntity(RecipeDto recipeDto){
        Recipe saveRecipe = mapper.map(recipeDto, Recipe.class);
                return saveRecipe;
    }
    public RecipeDto mapToDto(Recipe recipe){
        RecipeDto savedDto = mapper.map(recipe, RecipeDto.class);
        return savedDto;
    }
}
