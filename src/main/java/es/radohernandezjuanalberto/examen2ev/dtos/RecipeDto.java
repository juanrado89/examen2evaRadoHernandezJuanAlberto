package es.radohernandezjuanalberto.examen2ev.dtos;

import es.radohernandezjuanalberto.examen2ev.entities.RecipeIngredient;
import es.radohernandezjuanalberto.examen2ev.entities.Step;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecipeDto {

    private int recipeId;
    private int numberOfPeople;
    private int timeInMinutes;
    private String title;
    private String description;

    private List<RecipeIngredientDto> recipeIngredients;

    private List<StepDto> steps;
}
