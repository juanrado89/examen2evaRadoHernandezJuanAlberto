package es.radohernandezjuanalberto.examen2ev.controllers;

import es.radohernandezjuanalberto.examen2ev.Services.RecipeService;
import es.radohernandezjuanalberto.examen2ev.dtos.RecipeDto;
import es.radohernandezjuanalberto.examen2ev.entities.Recipe;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/by-people/")
    public ResponseEntity<List<RecipeDto>> getByPeopleNumber(@RequestParam int people){
        return ResponseEntity.ok(recipeService.getByPeopleNumber(people));
    }
}
