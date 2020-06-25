package com.example.weronika.controller;

import com.example.weronika.entity.Diet;
import com.example.weronika.service.DietService;
import org.springframework.web.bind.annotation.*;

@RestController
public class DietController {
    private final DietService dietService;

    public DietController(DietService dietService) {
        this.dietService = dietService;
    }

    @GetMapping("/diet/{id}")
    public Diet getDiet(@PathVariable String id){
        return dietService.getDietById(id);
    }

    @PostMapping("/diet")
    public Diet addDiet(@RequestBody Diet diet){
        return dietService.addDiet(diet);
    }

    @PutMapping("/diet/")
    public void editDiet(@RequestBody Diet diet){
        dietService.editDiet(diet);
    }
}
