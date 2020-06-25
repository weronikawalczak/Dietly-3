package com.example.weronika.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DietCalories { //kaloryczność, np. 1500, 2000 kcal
    private Integer dietCaloriesId;
    private Integer calories;

    @JsonBackReference
    private DietOption dietOption;

    public DietCalories(Integer dietCaloriesId, Integer calories) {
        this.dietCaloriesId = dietCaloriesId;
        this.calories = calories;
    }
}
