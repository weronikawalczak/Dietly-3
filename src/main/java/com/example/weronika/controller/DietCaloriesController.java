package com.example.weronika.controller;

import com.example.weronika.entity.DietCalories;
import com.example.weronika.service.DietCaloriesService;
import org.springframework.web.bind.annotation.*;

@RestController
public class DietCaloriesController {
    private final DietCaloriesService dietCaloriesService;

    public DietCaloriesController(DietCaloriesService dietCaloriesService) {
        this.dietCaloriesService = dietCaloriesService;
    }

    @GetMapping("/dietCalories/{id}")
    public DietCalories getDietCalories(@PathVariable String id){
        return dietCaloriesService.getDietCaloriesById(id);
    }

    @PostMapping("/dietCalories")
    public DietCalories addDietCalories(@RequestBody DietCalories dietCalories){
        return dietCaloriesService.addDietCalories(dietCalories);
    }

    @PutMapping("/dietCalories/")
    public void editDietCalories(@RequestBody DietCalories dietCalories){
        dietCaloriesService.editDietCalories(dietCalories);
    }
}
