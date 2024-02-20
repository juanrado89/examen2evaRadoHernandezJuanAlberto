package es.radohernandezjuanalberto.examen2ev.controllers;

import es.radohernandezjuanalberto.examen2ev.Services.IngredientService;
import es.radohernandezjuanalberto.examen2ev.dtos.IngredientDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping("/create")
    public ResponseEntity insertIngredient(@RequestBody IngredientDto ingrediente){
        int resultado = ingredientService.insertIngredient(ingrediente);
        if(resultado == 1){
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }else{
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
        }
    }
    @PostMapping("/delete")
    public ResponseEntity deleteIngresient(@RequestParam int id){
        int resultado = ingredientService.deleteIngredient(id);
        if(resultado == 1){
            return ResponseEntity.status(HttpStatus.OK).build();
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }
}
