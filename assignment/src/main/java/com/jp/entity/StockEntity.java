package com.jp.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StockEntity {
	
	public StockEntity(long id, String stockName, LocalDate stockDate, float high, float low, float open, float close,
			float adjClose, long volume) {
		super();
		this.id = id;
		this.stockName = stockName;
		this.stockDate = stockDate;
		this.high = high;
		this.low = low;
		this.open = open;
		this.close = close;
		this.adjClose = adjClose;
		this.volume = volume;
	}

	@Id
	@Column(unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String stockName;
	
	private LocalDate stockDate;
	
	private float high;
	
	private float low;
	
	private float open;
	
	private float close;
	
	private float adjClose;
	
	private long volume;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public LocalDate getStockDate() {
		return stockDate;
	}

	public void setStockDate(LocalDate stockDate) {
		this.stockDate = stockDate;
	}

	public float getHigh() {
		return high;
	}

	public void setHigh(float high) {
		this.high = high;
	}

	public float getLow() {
		return low;
	}

	public void setLow(float low) {
		this.low = low;
	}

	public float getOpen() {
		return open;
	}

	public void setOpen(float open) {
		this.open = open;
	}

	public float getClose() {
		return close;
	}

	public void setClose(float close) {
		this.close = close;
	}

	public float getAdjClose() {
		return adjClose;
	}

	public void setAdjClose(float adjClose) {
		this.adjClose = adjClose;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}
	
	

}
