package tn.esprit.gestionmagasinsk.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionmagasinsk.Entities.Fournisseur;
import tn.esprit.gestionmagasinsk.Entities.Produit;
import tn.esprit.gestionmagasinsk.Repositories.IFournisseurRepository;
import tn.esprit.gestionmagasinsk.Repositories.IProduitRepository;

@Service
public class IServiceFournisseurImp implements IServiceFournisseur {
    @Autowired
    IFournisseurRepository fournisseurRepository;
    @Autowired
    IProduitRepository produitRepository;
    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Fournisseur fournisseur=fournisseurRepository.findById(fournisseurId).orElse(null);
        Produit produit=produitRepository.findById(produitId).orElse(null);
        if(fournisseur!=null && produit!=null ){
            produit.getFournisseurslist().add(fournisseur);
        }
        produitRepository.save(produit);
    }
}
