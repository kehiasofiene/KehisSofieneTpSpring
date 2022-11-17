package tn.esprit.gestionmagasinsk.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagasinsk.Entities.Rayon;

public interface IRayonRepository extends JpaRepository<Rayon,Long> {
}
