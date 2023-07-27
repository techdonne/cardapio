package com.donnetech.cardapio.controller;

import com.donnetech.cardapio.dto.FoodRequestDTO;
import com.donnetech.cardapio.dto.FoodResponseDTO;
import com.donnetech.cardapio.entity.Food;
import com.donnetech.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/food")
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food food = new Food(data);
        foodRepository.save(food);
    }

    @GetMapping
    public List<FoodResponseDTO> getAll(){
        List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
