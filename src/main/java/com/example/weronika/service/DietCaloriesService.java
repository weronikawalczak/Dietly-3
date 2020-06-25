package com.example.weronika.service;

import com.example.weronika.entity.DietCalories;
import com.example.weronika.repository.DietCaloriesRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DietCaloriesService {
    private final DietCaloriesRepo dietCaloriesRepo;

    public DietCaloriesService(DietCaloriesRepo dietCaloriesRepo) {
        this.dietCaloriesRepo = dietCaloriesRepo;
    }

    public DietCalories getDietCaloriesById(@PathVariable String id){
        return dietCaloriesRepo.getDietCaloriesById(id);
    }

    public DietCalories addDietCalories(@RequestBody DietCalories dietCalories){
        //TODO Implement addition to DietOption
        return dietCaloriesRepo.addDietCalories(dietCalories);
    }

    public void editDietCalories(@RequestBody DietCalories dietCalories){
        dietCaloriesRepo.updateDietCalories(dietCalories);
    }
}
