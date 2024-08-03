package com.mochawake.model.dto.recipe;



import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class RecipeProfileViewModel {

    private List<RecipeDTO> recipesFromDto;




    public RecipeProfileViewModel() {
        this(new ArrayList<>());
    }

    public RecipeProfileViewModel(List<RecipeDTO> recipes) {
        this.recipesFromDto = recipes;
    }




}
