package tn.esprit.gestionmagasinsk.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.gestionmagasinsk.Entities.Produit;
import tn.esprit.gestionmagasinsk.Entities.Stock;

import java.util.List;

public interface IStockRepository extends JpaRepository<Stock,Long> {
    @Query("SELECT s.produitList FROM Stock s where s.qteStock < s.qteMin ")
    public List<Produit> getStockProduits();
}
