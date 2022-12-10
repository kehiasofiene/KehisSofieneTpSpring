package tn.esprit.gestionmagasinsk.Services;

import tn.esprit.gestionmagasinsk.Entities.CategorieClient;
import tn.esprit.gestionmagasinsk.Entities.Facture;

import java.util.Date;
import java.util.List;

public interface IServiceFacture {
    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
    List<Facture> getFacturesByClient(Long idClient);

}
