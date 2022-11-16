package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Stock;
import com.example.mahdifehri.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StockServiceImp implements StockServiceInt{
    @Autowired
    StockRepository stockRepository;
    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public void removeStock(Long id) {
        Stock stock=stockRepository.findById(id).orElse(null);
        stockRepository.delete(stock);

    }
}
