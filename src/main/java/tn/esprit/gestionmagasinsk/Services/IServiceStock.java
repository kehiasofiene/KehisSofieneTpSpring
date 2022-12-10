package tn.esprit.gestionmagasinsk.Services;

import tn.esprit.gestionmagasinsk.Entities.Stock;

import java.util.List;

public interface IServiceStock {
    List<Stock> retrieveAllStocks();
    Stock addStock(Stock s);
    Stock updateStock(Stock u);
    Stock retrieveStock(Long id);
    String retrieveStatusStock();

}
