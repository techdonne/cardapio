package com.donnetech.cardapio.dto;

import com.donnetech.cardapio.entity.Food;

public record FoodRequestDTO(Long id, String title, String image, Integer price) {
    public FoodRequestDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
