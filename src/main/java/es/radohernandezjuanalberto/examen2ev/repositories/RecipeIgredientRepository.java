package es.radohernandezjuanalberto.examen2ev.repositories;

import es.radohernandezjuanalberto.examen2ev.entities.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIgredientRepository extends JpaRepository<RecipeIngredient,Integer> {
}
