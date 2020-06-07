package com.monginis.CuisineAndRecipeService.controller;

import com.monginis.CuisineAndRecipeService.clientModel.CreateCuisineRequest;
import com.monginis.CuisineAndRecipeService.model.Cuisine;
import com.monginis.CuisineAndRecipeService.repository.CuisineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/cuisines")
public class CuisineController {

    @Autowired
    private CuisineRepository cuisineRepository;

    @GetMapping("/luxury")
    public List<String> getLuxuryCuisines() {
        // call db
        return Arrays.asList("Gourmet Indian", "Rare Venice Italian");
    }

    @GetMapping("/basic")
    public List<String> getBasicCuisines() {
        return Arrays.asList("Chinese", "Italian");
    }

    // create new cuisine
    @PostMapping
    public Cuisine createNewCuisine(@RequestBody CreateCuisineRequest createCuisineRequest) {
        Cuisine newCuisine = new Cuisine();
        newCuisine.setCuisineName(createCuisineRequest.cuisineName);
        newCuisine.setCuisineId(createCuisineRequest.getCuisineId());
        return cuisineRepository.save(newCuisine);
    }
}
