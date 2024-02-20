package es.radohernandezjuanalberto.examen2ev.Services;

import es.radohernandezjuanalberto.examen2ev.dtos.IngredientDto;
import es.radohernandezjuanalberto.examen2ev.entities.Ingredient;
import es.radohernandezjuanalberto.examen2ev.repositories.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public int insertIngredient(IngredientDto ingrediente) {
        Ingredient ingredienteInsertar = new Ingredient();
        ingredienteInsertar.setName(ingrediente.getName());

        Ingredient resultado = ingredientRepository.save(ingredienteInsertar);

        Optional<Ingredient> devolver = ingredientRepository.findById(resultado.getIngredientId());
        if(devolver.isPresent()){
            return 1;
        }else{
            return 0;
        }
    }

    public int deleteIngredient(int id) {
        Optional<Ingredient> ingredient = ingredientRepository.findById(id);
        if(ingredient.isPresent()){
            ingredientRepository.delete(ingredient.orElseThrow());
            return 1;
        }else{
            return 0;
        }
    }
}
