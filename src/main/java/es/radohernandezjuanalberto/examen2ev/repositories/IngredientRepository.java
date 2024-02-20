package es.radohernandezjuanalberto.examen2ev.repositories;

import es.radohernandezjuanalberto.examen2ev.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient,Integer> {
}
