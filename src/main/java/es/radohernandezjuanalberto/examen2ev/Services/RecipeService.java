package es.radohernandezjuanalberto.examen2ev.Services;

import es.radohernandezjuanalberto.examen2ev.dtos.IngredientDto;
import es.radohernandezjuanalberto.examen2ev.dtos.RecipeDto;
import es.radohernandezjuanalberto.examen2ev.dtos.RecipeIngredientDto;
import es.radohernandezjuanalberto.examen2ev.entities.Recipe;
import es.radohernandezjuanalberto.examen2ev.entities.RecipeIngredient;
import es.radohernandezjuanalberto.examen2ev.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<RecipeDto> getByPeopleNumber(int people) {
        List<Recipe> recipes = recipeRepository.getRecipesByNumberOfPeople(people);
        List<RecipeDto> resultado = new ArrayList<>();
        if(!recipes.isEmpty()){
            for (Recipe recipe: recipes){
                RecipeDto insertar = new RecipeDto();
                insertar.setNumberOfPeople(recipe.getNumberOfPeople());
                insertar.setDescription(recipe.getDescription());
                insertar.setTitle(recipe.getTitle());
                List<RecipeIngredientDto> ingredientes = new ArrayList<>();
                List<RecipeIngredient> listaIngredientes = recipe.getRecipeIngredients();
                for(RecipeIngredient ingrediente:listaIngredientes){
                    RecipeIngredientDto aniadir = new RecipeIngredientDto();
                    aniadir.setQuantity(ingrediente.getQuantity());
                    aniadir.setRecipeIngredientId(ingrediente.getRecipeIngredientId());
                    IngredientDto ingredienteAniadir = new IngredientDto();
                    ingredienteAniadir.setName(ingrediente.getIngredient().getName());
                    aniadir.setIngredient(ingredienteAniadir);
                    ingredientes.add(aniadir);
                }
                insertar.setRecipeIngredients(ingredientes);
                resultado.add(insertar);
            }
        }
        return resultado;
    }
}
