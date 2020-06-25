package com.example.weronika.service;

import com.example.weronika.entity.DietOption;
import com.example.weronika.repository.DietOptionRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DietOptionService {
    private final DietOptionRepo dietOptionRepo;

    public DietOptionService(DietOptionRepo dietOptionRepo) {
        this.dietOptionRepo = dietOptionRepo;
    }

    public DietOption getDietOptionById(@PathVariable String id){
        return dietOptionRepo.getDietOptionById(id);
    }

    public DietOption addDietOption(@RequestBody DietOption dietOption){
        //TODO Implement addition to Diet and handle DietCalories if present
        return dietOptionRepo.addDietOption(dietOption);
    }

    public void editDietOption(@RequestBody DietOption dietOption){
        //TODO implement
        dietOptionRepo.updateDietOption(dietOption);
    }
}
