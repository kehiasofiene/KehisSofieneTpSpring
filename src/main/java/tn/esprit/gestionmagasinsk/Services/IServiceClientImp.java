package tn.esprit.gestionmagasinsk.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionmagasinsk.Entities.CategorieClient;
import tn.esprit.gestionmagasinsk.Entities.Client;
import tn.esprit.gestionmagasinsk.Repositories.IClientRepository;

import java.util.Date;
import java.util.List;
@Service
public class IServiceClientImp implements IServiceClient{
    @Autowired
    IClientRepository clientRepository;
    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client updateClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public float getChiffreAffaireParCategorieClient(CategorieClient categorieClient, Date startDate, Date endDate) {
            return clientRepository.getChiffreAffaireParCategorieClient(categorieClient,startDate,endDate);
        };
    }

