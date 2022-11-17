package tn.esprit.gestionmagasinsk.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestionmagasinsk.Entities.Client;

public interface IClientRepository extends JpaRepository<Client,Long> {
}
