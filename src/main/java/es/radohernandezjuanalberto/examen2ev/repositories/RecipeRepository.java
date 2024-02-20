package es.radohernandezjuanalberto.examen2ev.repositories;

import es.radohernandezjuanalberto.examen2ev.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe,Integer> {

    List<Recipe> getRecipesByNumberOfPeople(@Param("people") int people);
}
