package tn.esprit.gestionmagasinsk.Services;

import tn.esprit.gestionmagasinsk.Entities.Facture;

import java.util.List;

public interface IServiceFacture {
    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);
}
