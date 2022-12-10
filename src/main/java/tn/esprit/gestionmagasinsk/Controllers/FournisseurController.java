package tn.esprit.gestionmagasinsk.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.gestionmagasinsk.Services.IServiceFournisseur;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {
    @Autowired
    IServiceFournisseur serviceFournisseur;
    @PostMapping("assign/{fournisseurId}/{produitId}")
    public void assignFournisseurToProduit(@PathVariable Long fournisseurId, @PathVariable Long produitId) {
          serviceFournisseur.assignFournisseurToProduit(fournisseurId,produitId);
    }
}
