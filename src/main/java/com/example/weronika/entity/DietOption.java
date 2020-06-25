package com.example.weronika.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class DietOption { //wariant diety, np. "5 posiłków" lub "3 posiłki"
    private Integer dietOptionId;
    private String name;
    private String abbreviation;

    @JsonBackReference
    private Diet diet;

    @JsonManagedReference
    private Set<DietCalories> dietCalories;

    public DietOption(Integer dietOptionId, String name, String abbreviation) {
        this.dietOptionId = dietOptionId;
        this.name = name;
        this.abbreviation = abbreviation;
    }
}