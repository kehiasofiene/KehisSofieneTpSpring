package tn.esprit.gestionmagasinsk.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagasinsk.Entities.Fournisseur;

public interface IFournisseurRepository extends JpaRepository<Fournisseur,Long> {
}
