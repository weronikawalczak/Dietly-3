package com.example.weronika.controller;

import com.example.weronika.entity.DietOption;
import com.example.weronika.service.DietOptionService;
import org.springframework.web.bind.annotation.*;

@RestController
public class DietOptionController {
    private final DietOptionService dietOptionService;

    public DietOptionController(DietOptionService dietOptionService) {
        this.dietOptionService = dietOptionService;
    }

    @GetMapping("/dietOption/{id}")
    public DietOption getDietOption(@PathVariable String id){
        return dietOptionService.getDietOptionById(id);
    }

    @PostMapping("/dietOption")
    public DietOption addDietOption(@RequestBody DietOption dietOption){
        return dietOptionService.addDietOption(dietOption);
    }

    @PutMapping("/dietOption/")
    public void editDietOption(@RequestBody DietOption dietOption){
        dietOptionService.editDietOption(dietOption);
    }
}
