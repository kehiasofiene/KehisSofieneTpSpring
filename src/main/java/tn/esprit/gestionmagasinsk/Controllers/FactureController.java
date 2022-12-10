package tn.esprit.gestionmagasinsk.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagasinsk.Entities.CategorieClient;
import tn.esprit.gestionmagasinsk.Entities.Facture;
import tn.esprit.gestionmagasinsk.Services.IServiceFacture;

import java.util.Date;
import java.util.List;
@RestController
@RequestMapping("/facture")
public class FactureController {
    @Autowired
    IServiceFacture serviceFacture;

    @GetMapping
    public List<Facture> retrieveAllFactures(){
      return serviceFacture.retrieveAllFactures();
    }

    @DeleteMapping("{id}")
   public void cancelFacture(@PathVariable Long id){
         serviceFacture.cancelFacture(id);
    }

    @PostMapping("{id}")
    public Facture retrieveFacture(@PathVariable Long id){
        return serviceFacture.retrieveFacture(id);
    }

   @GetMapping("{idclient}")
    public  List<Facture> getFacturesByClient(@PathVariable Long idclient){
        return serviceFacture.getFacturesByClient(idclient);
    }


    }




