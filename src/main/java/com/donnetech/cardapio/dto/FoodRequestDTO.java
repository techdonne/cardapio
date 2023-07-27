package com.donnetech.cardapio.dto;

import com.donnetech.cardapio.entity.Food;

public record FoodRequestDTO(String title, String image, Integer price) {

}
