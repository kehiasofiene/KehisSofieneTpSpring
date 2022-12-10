package tn.esprit.gestionmagasinsk.Services;

import tn.esprit.gestionmagasinsk.Entities.CategorieClient;
import tn.esprit.gestionmagasinsk.Entities.Client;

import java.util.Date;
import java.util.List;

public interface IServiceClient {
    List<Client> retrieveAllClients();
    Client addClient(Client c);
    void deleteClient(Long id);
    Client updateClient(Client c);
    Client retrieveClient(Long id);
    public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate);


}
