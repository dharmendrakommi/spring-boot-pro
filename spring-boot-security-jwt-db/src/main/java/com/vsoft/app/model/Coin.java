package com.vsoft.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coin")
public class Coin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "coinid")
	private Long coinId;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private int price;

	public Long getCoinId() {
		return coinId;
	}

	public void setCoinId(Long coinId) {
		this.coinId = coinId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
