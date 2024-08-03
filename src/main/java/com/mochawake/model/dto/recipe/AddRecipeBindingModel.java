package com.mochawake.model.dto.recipe;
import com.mochawake.model.enums.TypeName;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class AddRecipeBindingModel {

    private String name;

    private TypeName type;

    private String photoUrl;

    private String ingredients;

    private String recipeDescription;


}
