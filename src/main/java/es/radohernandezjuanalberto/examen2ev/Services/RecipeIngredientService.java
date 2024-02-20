package es.radohernandezjuanalberto.examen2ev.Services;

import es.radohernandezjuanalberto.examen2ev.repositories.RecipeIgredientRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeIngredientService {

    private RecipeIgredientRepository recipeIgredientRepository;

    public RecipeIngredientService(RecipeIgredientRepository recipeIgredientRepository) {
        this.recipeIgredientRepository = recipeIgredientRepository;
    }


}
