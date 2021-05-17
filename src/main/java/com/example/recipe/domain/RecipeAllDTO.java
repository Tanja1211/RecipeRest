package com.example.recipe.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecipeAllDTO {
	private Long recipeId;
	private String name;
	private String source;
	private int numberOfIngredients;
	private List<String> ingredients;
	private String preparationTime;
	private String instructions;
		
}
