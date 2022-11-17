package tn.esprit.gestionmagasinsk.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagasinsk.Entities.Stock;

public interface IStockRepository extends JpaRepository<Stock,Long> {
}
