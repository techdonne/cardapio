package com.donnetech.cardapio;

import com.donnetech.cardapio.entity.Food;
import com.donnetech.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CardapioApplication implements CommandLineRunner{
	@Autowired
	private FoodRepository foodRepository;

	public static void main(String[] args) {
		SpringApplication.run(CardapioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Food f1 = new Food(null, "lasanha", "3188318318108.png", 2);
		Food f2 = new Food(null, "mocotó", "3188318318108.png", 3);

		foodRepository.saveAll(Arrays.asList(f1,f2));
	}
}
