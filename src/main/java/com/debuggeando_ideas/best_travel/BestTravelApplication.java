package com.debuggeando_ideas.best_travel;

import com.debuggeando_ideas.best_travel.domain.repositories.FlyRepository;
import com.debuggeando_ideas.best_travel.domain.repositories.HotelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BestTravelApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BestTravelApplication.class, args);
	}

	@Autowired
	private FlyRepository flyRepository;
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public void run(String... args) throws Exception {
		var fly = flyRepository.findById(7L).get();

		log.info(String.valueOf(fly));
	}
}
