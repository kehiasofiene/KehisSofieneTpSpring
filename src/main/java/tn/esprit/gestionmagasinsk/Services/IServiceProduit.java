package tn.esprit.gestionmagasinsk.Services;

import tn.esprit.gestionmagasinsk.Entities.Produit;

import java.util.Date;
import java.util.List;

public interface IServiceProduit {
    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);

    void assignProduitToStock(Long idProduit, Long idStock);

    float getRevenuBrutProduit(Long idProduit, Date startDate, Date endDate);
}
