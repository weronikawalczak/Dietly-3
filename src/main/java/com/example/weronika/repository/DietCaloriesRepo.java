package com.example.weronika.repository;

import com.example.weronika.entity.DietCalories;
import org.springframework.stereotype.Repository;


@Repository
public class DietCaloriesRepo {
    public DietCalories getDietCaloriesById(String id){
        return getExampleDietCalories();
    }

    public DietCalories addDietCalories(DietCalories dietCalories){
        return null;
    }

    public void updateDietCalories(DietCalories dietCalories){}


    private DietCalories getExampleDietCalories() {
        return new DietCalories(1, 1500);
    }
}
