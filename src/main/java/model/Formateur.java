package model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Formateur {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String nom;
    private String age;
    private String sexe;

    public Formateur() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Formateur(String nom, String age, String sexe) {
        super();
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
    }
}