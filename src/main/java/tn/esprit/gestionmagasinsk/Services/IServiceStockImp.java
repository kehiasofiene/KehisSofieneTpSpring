package tn.esprit.gestionmagasinsk.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionmagasinsk.Entities.Stock;
import tn.esprit.gestionmagasinsk.Repositories.IClientRepository;
import tn.esprit.gestionmagasinsk.Repositories.IStockRepository;

import java.util.List;
@Service
public class IServiceStockImp implements IServiceStock{
    @Autowired
    IStockRepository stockRepository;
    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock u) {
        return stockRepository.save(u);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }
}
