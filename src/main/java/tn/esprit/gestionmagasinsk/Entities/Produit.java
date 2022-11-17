package tn.esprit.gestionmagasinsk.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;
    @ManyToMany
    private List<Fournisseur> fournisseurslist;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Rayon rayon;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Stock stock;
    @JsonIgnore
    @OneToOne(cascade=CascadeType.PERSIST)
    private DetailProduit detailProduit;
    @OneToMany(mappedBy = "produits")
    private List<DetailFacture> detailFacture;


}
