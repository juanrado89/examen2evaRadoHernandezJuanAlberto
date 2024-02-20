package es.radohernandezjuanalberto.examen2ev.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "recipe_ingredient",indexes = {@Index(columnList = "recipe_id, ingredient_id",unique = true)})
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_ingredient_id",scale = 11,nullable = false)
    private int recipeIngredientId;
    @Basic
    @Column(name = "ingredient_id",scale = 11,nullable = false,insertable = false,updatable = false)
    private int ingredientId;
    @Basic
    @Column(name = "quantity",scale = 11,nullable = false)
    private int quantity;
    @Basic
    @Column(name = "recipe_id",scale = 11,nullable = false,insertable = false,updatable = false)
    private int recipeId;

    @ManyToOne
    @JoinColumn(name = "ingredient_id", referencedColumnName = "ingredient_id", nullable = false, updatable = false)
    private Ingredient ingredient;
    @ManyToOne
    @JoinColumn(name = "recipe_id", referencedColumnName = "recipe_id", nullable = false, updatable = false)
    private Recipe recipe;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecipeIngredient that)) return false;
        return ingredientId == that.ingredientId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientId);
    }
}
