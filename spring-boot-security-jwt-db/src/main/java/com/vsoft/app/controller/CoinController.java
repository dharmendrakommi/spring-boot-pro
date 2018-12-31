package com.vsoft.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vsoft.app.model.Coin;
import com.vsoft.app.repository.CoinRepo;

@RestController
@CrossOrigin
public class CoinController {

	@Autowired
	CoinRepo repo;

	@PostMapping("/coin")
	public void craeteCoin(@RequestBody Coin coin) {

		repo.save(coin);
	}

	@GetMapping("/coin")
	public void getCoins() {

		List<Coin> coins = new ArrayList<>();

		repo.findAll().forEach(coins::add);
	}

	@GetMapping("/coin/{coinId}")
	public void getCoin(@PathVariable Long coinId) {

		List<Coin> coins = new ArrayList<>();

		repo.findAll().forEach(coins::add);
	}

	@PutMapping("/coin")
	public void updateCoin(@RequestBody Coin coin) {

		repo.save(coin);
	}

	@DeleteMapping("/coin")
	public void deleteCoin(Long coinId) {

		repo.deleteById(coinId);
	}

}
