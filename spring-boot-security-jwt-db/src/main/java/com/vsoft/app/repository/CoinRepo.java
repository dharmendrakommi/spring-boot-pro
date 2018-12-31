package com.vsoft.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.vsoft.app.model.Coin;

public interface CoinRepo  extends CrudRepository<Coin,Long>{

}
