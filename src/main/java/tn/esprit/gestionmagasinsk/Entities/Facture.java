package tn.esprit.gestionmagasinsk.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacture;
    private float montantRemise;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateFacture;
    private Boolean active;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactureList;
}
