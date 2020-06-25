package com.example.weronika.repository;

import com.example.weronika.entity.DietOption;
import org.springframework.stereotype.Repository;


@Repository
public class DietOptionRepo {

    public DietOption getDietOptionById(String id){
        return getExampleDietOption();
    }

    public DietOption addDietOption(DietOption dietOption){
        return null;
    }

    public void updateDietOption(DietOption dietOption){}


    private DietOption getExampleDietOption() {
        return new DietOption(1, "option1", "firstOption");
    }
}
