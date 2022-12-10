package tn.esprit.gestionmagasinsk.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagasinsk.Entities.CategorieClient;
import tn.esprit.gestionmagasinsk.Entities.Client;
import tn.esprit.gestionmagasinsk.Services.IServiceClient;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    IServiceClient serviceClient;

    @GetMapping
    public List<Client> GetAllClients(){
        return serviceClient.retrieveAllClients();
    }

    @PostMapping
    public Client addClients(@RequestBody Client c){
        return serviceClient.addClient(c);
    }

    @PutMapping
    public Client UpdateClient(@RequestBody Client c){
        return serviceClient.updateClient(c);
    }

    @GetMapping( value="/getChiffreAffaireParCategorieClient/{categorieClient}/{startDate}/{endDate}")
    public float getChiffreAffaireParCategorieClient(@PathVariable("categorieClient") CategorieClient categorieClient,
                                                     @PathVariable(name = "startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
                                                     @PathVariable(name = "endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {

        return serviceClient.getChiffreAffaireParCategorieClient(categorieClient, startDate, endDate);
    }


    @DeleteMapping("{idclient}")
    public void removeClient(@PathVariable Long idclient){
         serviceClient.deleteClient(idclient);
    }

    @GetMapping("{idClient}")
    public Client GetClient(@PathVariable Long idClient){
        return serviceClient.retrieveClient(idClient);
    }
}
