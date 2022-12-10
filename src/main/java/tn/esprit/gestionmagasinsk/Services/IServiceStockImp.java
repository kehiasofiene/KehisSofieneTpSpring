package tn.esprit.gestionmagasinsk.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.gestionmagasinsk.Entities.Produit;
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
   @Scheduled(cron ="0 22 * * * ? ")
    @Override
    public String retrieveStatusStock() {
        List<Produit> produitList =  stockRepository.getStockProduits() ;
        produitList.stream().forEach(produit -> System.out.println(produit.getLibelleProduit()));
        // System.out.println( produitList.stream().map(Object::toString).toArray(String[]::new)) ;

        return null ;
    }
}
