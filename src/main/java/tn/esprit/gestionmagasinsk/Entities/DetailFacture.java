package tn.esprit.gestionmagasinsk.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailFacture;
    private int qte;
    private float prixTotal;
    private int pourcentageRemise;
    private int montantRemise;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Produit produits;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Facture facture;
}
