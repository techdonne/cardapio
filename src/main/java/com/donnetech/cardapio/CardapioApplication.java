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
		Food f1 = new Food(null, "Lasanha", "https://tse2.mm.bing.net/th?id=OIP.7PR6CpsUAO7F8Sjea-WpjgHaE6&pid=Api&P=0&h=180", 20);
		Food f2 = new Food(null, "Mocotó", "https://tse2.mm.bing.net/th?id=OIP.LQ-Vx5vazYCvZj0YXBfjegHaE8&pid=Api&P=0&h=180", 30);
		Food f3 = new Food(null, "Hamburguer", "https://cdn.casaeculinaria.com/wp-content/uploads/2023/04/05163949/Hamburguer-artesanal-860x484.webp", 10);
		Food f4 = new Food(null, "Hot-dog", "https://images.freeimages.com/images/large-previews/32f/delicacy-5-1323401.jpg", 8);
		Food f5 = new Food(null, "Espaguete", "https://www.casaredo.com/blog/wp-content/uploads/2021/01/receita-espaguete-tradicional-perfeito.jpg", 25);
		Food f6 = new Food(null, "Panqueca", "https://tse4.mm.bing.net/th?id=OIP.suym-tVs7ih7dycDYaLaygHaE9&pid=Api&P=0&h=180", 15);


		foodRepository.saveAll(Arrays.asList(f1,f2,f3,f4, f5, f6));
	}
}
