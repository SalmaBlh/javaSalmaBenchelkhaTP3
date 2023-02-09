package model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.CascadeType;
import javax.persistence.GenerationType;

@Entity
public class Formation {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String label;
    private int duree;
    private String lieu;

    @ManyToOne(cascade=CascadeType.ALL)
    private Formateur formateur;

    public Formation(String label, int duree, String lieu, Formateur formateur) {
        super();
        this.label = label;
        this.duree = duree;
        this.lieu = lieu;
        this.formateur = formateur;
    }

    public Formation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }
}