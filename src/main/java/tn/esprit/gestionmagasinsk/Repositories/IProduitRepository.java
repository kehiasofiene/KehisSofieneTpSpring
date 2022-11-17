package tn.esprit.gestionmagasinsk.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagasinsk.Entities.Produit;

public interface IProduitRepository extends JpaRepository <Produit,Long> {

}
