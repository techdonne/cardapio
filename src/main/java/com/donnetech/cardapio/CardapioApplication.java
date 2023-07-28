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
		Food f1 = new Food(null, "lasanha", "https://st2.depositphotos.com/4164031/6914/i/950/depositphotos_69145633-stock-photo-flag-of-brazil.jpg", 2);
		Food f2 = new Food(null, "mocotó", "https://st2.depositphotos.com/4164031/6914/i/950/depositphotos_69145633-stock-photo-flag-of-brazil.jpg", 3);

		foodRepository.saveAll(Arrays.asList(f1,f2));
	}
}
