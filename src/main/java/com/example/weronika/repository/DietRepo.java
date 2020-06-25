package com.example.weronika.repository;

import com.example.weronika.entity.Diet;
import com.example.weronika.entity.DietCalories;
import com.example.weronika.entity.DietOption;
import org.springframework.stereotype.Repository;

import java.util.HashSet;


@Repository
public class DietRepo {

    public Diet getDietById(String id){
        return getExampleDiet();
    }

    public Diet addDiet(Diet diet){
        return null;
    }

    public void updateDiet(Diet diet){}


    private Diet getExampleDiet() {
        Diet diet = new Diet(1, "diet1", "Diet1 desc");
        DietOption dietOption = new DietOption(1, "option1", "first");
        DietCalories dietCalories = new DietCalories(1, 1500);

        diet.setDietOptions(new HashSet<>());
        diet.getDietOptions().add(dietOption);

        dietOption.setDietCalories(new HashSet<>());
        dietOption.getDietCalories().add(dietCalories);
        return diet;
    }
}
