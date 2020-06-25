package com.example.weronika.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class Diet { //typ diety, np. wegetariańska, sportowa
    private Integer dietId;
    private String name;
    private String description;

    @JsonManagedReference
    private Set<DietOption> dietOptions;

    public Diet(Integer dietId, String name, String description) {
        this.dietId = dietId;
        this.name = name;
        this.description = description;
    }
}