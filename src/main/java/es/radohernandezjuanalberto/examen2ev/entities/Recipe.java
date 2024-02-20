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
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id",scale = 11, nullable = false)
    private int recipeId;
    @Basic
    @Column(name = "number_of_people",scale = 11, nullable = false)
    private int numberOfPeople;
    @Basic
    @Column(name = "time_in_minutes",scale = 11, nullable = false)
    private int timeInMinutes;
    @Basic
    @Column(name = "title",length = 100, nullable = false)
    private String title;
    @Basic
    @Column(name = "description",length = 2000)
    private String description;

    @OneToMany(mappedBy = "recipe")
    private List<RecipeIngredient> recipeIngredients;

    @OneToMany(mappedBy = "recipe")
    private List<Step> steps;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe recipe)) return false;
        return recipeId == recipe.recipeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeId);
    }
}
