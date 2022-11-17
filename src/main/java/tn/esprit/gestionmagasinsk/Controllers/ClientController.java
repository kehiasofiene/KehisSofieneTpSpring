package tn.esprit.gestionmagasinsk.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagasinsk.Entities.Client;
import tn.esprit.gestionmagasinsk.Services.IServiceClient;

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

    @DeleteMapping("{idclient}")
    public void removeClient(@PathVariable Long idclient){
         serviceClient.deleteClient(idclient);
    }

    @GetMapping("{idClient}")
    public Client GetClient(@PathVariable Long idClient){
        return serviceClient.retrieveClient(idClient);
    }
}
