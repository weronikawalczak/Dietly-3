package com.example.weronika.service;

import com.example.weronika.entity.Diet;
import com.example.weronika.repository.DietRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@Service
public class DietService {
    private final DietRepo dietRepo;

    public DietService(DietRepo dietRepo) {
        this.dietRepo = dietRepo;
    }

    public Diet getDietById(@PathVariable String id){
        return dietRepo.getDietById(id);
    }

    public Diet addDiet(@RequestBody Diet diet){
        return dietRepo.addDiet(diet);
    }

    public void editDiet(@RequestBody Diet diet){
        dietRepo.updateDiet(diet);
    }
}
