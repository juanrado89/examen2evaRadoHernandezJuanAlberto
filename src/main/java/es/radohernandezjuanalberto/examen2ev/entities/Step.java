package es.radohernandezjuanalberto.examen2ev.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "step")
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "step_id",scale = 11, nullable = false)
    private int stepId;
    @Basic
    @Column(name = "step_order",scale = 11, nullable = false)
    private int stepOrder;
    @Basic
    @Column(name = "description",length = 255, nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "recipe_id", referencedColumnName = "recipe_id", nullable = false, updatable = false)
    private Recipe recipe;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Step step)) return false;
        return stepId == step.stepId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepId);
    }


}
