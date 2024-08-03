package com.mochawake.model.dto.recipe;
import com.mochawake.model.entity.Recipe;
import com.mochawake.model.entity.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipeDTO {

    private Long id;

    private String name;

    private Type type;

    private String photoUrl;

    private String ingredients;

    private String recipeDescription;

    public static RecipeDTO createFromRecipe(Recipe recipe) {
        RecipeDTO recipeDTO = new RecipeDTO();

        recipeDTO.setId(recipe.getId());
        recipeDTO.setRecipeDescription(recipe.getRecipeDescription());
        recipeDTO.setType(recipe.getType());
        recipeDTO.setName(recipe.getName());
        recipeDTO.setIngredients(recipe.getIngredients());
        recipeDTO.setPhotoUrl(recipe.getPhotoUrl());


        return recipeDTO;
    }
    
    

}