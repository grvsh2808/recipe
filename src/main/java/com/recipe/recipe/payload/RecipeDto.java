package com.recipe.recipe.payload;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@NoArgsConstructor
public class RecipeDto {



        private String title;
        private String description;
        private String recipeRating;
        private String dietType;
        private String photo;
        private List<String> ingredient;
        private String directions;
        private String nutritionValue;

    }


