package com.example.mahdifehri.services;

import com.example.mahdifehri.entity.Stock;

import java.util.List;

public interface StockServiceInt {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock s);

    Stock retrieveStock(Long id);

    void removeStock(Long id);
}
