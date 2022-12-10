package tn.esprit.gestionmagasinsk.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.gestionmagasinsk.Entities.CategorieClient;
import tn.esprit.gestionmagasinsk.Entities.Facture;

import java.util.Date;
import java.util.List;

public interface IFactureRepository extends JpaRepository<Facture,Long> {
  List<Facture> findFactureByClient_IdClient(long idClient);
}
