package com.jp.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jp.entity.StockEntity;

public interface StockRepository extends JpaRepository<StockEntity, Long> {
	
	List<StockEntity> findByStockDate(LocalDate stockDate);
	
	List<StockEntity> findbyStockName(String stockName);
	
	StockEntity findByStockNameAndStockDate(String stockName,LocalDate stockDate);

}
