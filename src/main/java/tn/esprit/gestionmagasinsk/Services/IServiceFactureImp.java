package tn.esprit.gestionmagasinsk.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionmagasinsk.Entities.CategorieClient;
import tn.esprit.gestionmagasinsk.Entities.Client;
import tn.esprit.gestionmagasinsk.Entities.Facture;
import tn.esprit.gestionmagasinsk.Repositories.IClientRepository;
import tn.esprit.gestionmagasinsk.Repositories.IFactureRepository;

import java.util.Date;
import java.util.List;
@Service
public class IServiceFactureImp implements IServiceFacture{
    @Autowired
    IFactureRepository factureRepository;
    @Autowired
    IClientRepository clientRepository;
    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll() ;
    }

    @Override
    public void cancelFacture(Long id) {
        Facture facture=factureRepository.findById(id).orElse(null);
        if(facture.getActive()==Boolean.FALSE){
            factureRepository.deleteById(id);
        }
        factureRepository.save(facture);
    }

    @Override
    public Facture retrieveFacture(Long id) {
       return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        return factureRepository.findFactureByClient_IdClient(idClient);
    }



}
