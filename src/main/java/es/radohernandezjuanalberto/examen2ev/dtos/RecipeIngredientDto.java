package es.radohernandezjuanalberto.examen2ev.dtos;

import es.radohernandezjuanalberto.examen2ev.entities.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecipeIngredientDto {
    private int recipeIngredientId;
    private IngredientDto ingredient;
    private int quantity;
}
