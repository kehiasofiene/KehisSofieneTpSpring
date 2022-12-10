package tn.esprit.gestionmagasinsk.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagasinsk.Entities.Produit;
import tn.esprit.gestionmagasinsk.Services.IServiceProduit;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {
    @Autowired
    IServiceProduit serviceProduit;

    @GetMapping
    public List<Produit> GetAllProducts() {
        return serviceProduit.retrieveAllProduits();
    }

    @PostMapping("{idRayon}/{idStock}")
    public Produit addProduit(@RequestBody Produit p, @PathVariable Long idRayon, @PathVariable Long idStock) {
        return serviceProduit.addProduit(p, idRayon, idStock);
    }

    @GetMapping("{idProduit}")
    public Produit GetProduit(@PathVariable Long idProduit) {
        return serviceProduit.retrieveProduit(idProduit);
    }

    @PostMapping("assign/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable Long idProduit, @PathVariable Long idStock) {
        serviceProduit.assignProduitToStock(idProduit, idStock);
    }

   /* @GetMapping( "/getRevenuBrutProduit/{idProduit}/{startDate}/{endDate}")
    public float getRevenuBrutProduit(@PathVariable("idProduit") Long idProduit,
                                      @PathVariable(name = "startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
                                      @PathVariable(name = "endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {

        return serviceProduit.getRevenuBrutProduit(idProduit, startDate, endDate);
    }
*/

}

