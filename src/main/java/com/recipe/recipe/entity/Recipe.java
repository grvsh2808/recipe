package com.recipe.recipe.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="Recipe")
@Entity
public class Recipe {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long Id;
   @Column(name="title",nullable = true)
   private String title;
    @Column(name="descriptio",nullable = true)
    private String description;
    @Column(name="recipe_rating",nullable = true)
    private String recipeRating;
    @Column(name="diet_type",nullable = true)
   private String dietType;


    @Column(name="photo",nullable = true)
    private String photo;

    @Column(name="ingredient",nullable = true)
    @ElementCollection
    private List<String> ingredient;

    @Column(name="directions",nullable = true)
    private String directions;
    @Column(name="nutrition_value",nullable = true)
    private String nutritionValue;


}








