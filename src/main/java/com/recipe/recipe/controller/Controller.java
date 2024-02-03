package com.recipe.recipe.controller;

import com.recipe.recipe.payload.RecipeDto;
import com.recipe.recipe.service.RecipeService;
import com.recipe.recipe.service.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recipe")
public class Controller {
    @Autowired
    private RecipeServiceImpl recipeService;

    public Controller(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public ResponseEntity<RecipeDto> NewRecipe(@RequestBody RecipeDto recipeDto){
        RecipeDto savedDto = recipeService.createRecipe(recipeDto);
        return new ResponseEntity<>(savedDto, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<RecipeDto> getRecipeById(@PathVariable Long id){
        RecipeDto dtoById = recipeService.getRecipeById(id);
        return new ResponseEntity<>(dtoById,HttpStatus.OK);
    }
}
