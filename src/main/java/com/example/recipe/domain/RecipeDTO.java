package com.example.recipe.domain;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecipeDTO {
	private Long recipeId;
	private String name;
	private String source;
	private Map<String, String> ingredients;
	private String preparationTime;
	private String instructions;

}
