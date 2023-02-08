package model;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        // Ouverture de l'unité de travail JPA
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tpJava");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Ouverture de la transaction
        EntityTransaction entityTransaction = entityManager.getTransaction();

        // Création d'une formation et d'un formateur
        Formation formation = new Formation("Hibernate",3,"Paris");
        Formateur formateur = new Formateur("George","34","Masculin");

        // Persistance des objets dans la BDD
        entityManager.persist(formation);
        entityManager.persist(formateur);

        // Fermeture de la transaction
        entityTransaction.commit();

        // Fermeture de l'unité de travail JPA
        entityManager.close();
        entityManagerFactory.close();
    }
}
