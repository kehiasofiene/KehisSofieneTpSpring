package tn.esprit.gestionmagasinsk.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionmagasinsk.Entities.Produit;
import tn.esprit.gestionmagasinsk.Entities.Rayon;
import tn.esprit.gestionmagasinsk.Entities.Stock;
import tn.esprit.gestionmagasinsk.Repositories.IProduitRepository;
import tn.esprit.gestionmagasinsk.Repositories.IRayonRepository;
import tn.esprit.gestionmagasinsk.Repositories.IStockRepository;

import java.util.List;

@Service
public class IServiceProduitImp implements IServiceProduit {
     @Autowired
    IProduitRepository produitRepository;
     @Autowired
    IStockRepository stockRepository;
     @Autowired
    IRayonRepository rayonRepository;
    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Stock stock=stockRepository.findById(idStock).orElse(null);
        Rayon rayon=rayonRepository.findById(idRayon).orElse(null);
        if(stock !=null && rayon !=null){
            p.setRayon(rayon);
            p.setStock(stock);
        }
        return produitRepository.save(p);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit=produitRepository.findById(idProduit).orElse(null);
        Stock s=stockRepository.findById(idStock).orElse(null);

        if(produit!=null && s!=null){
            produit.setStock(s);
        }
        produitRepository.save(produit);
        ;}
}
