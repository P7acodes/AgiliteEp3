package org.example.agilite;

import org.example.agilite.Accessoires;
import org.example.agilite.Ordinateur;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestOrdinateur {
    private Ordinateur ordinateur;

    @Before
    public void setUp() {
        // Initialisation d'un ordinateur avant chaque test
        ordinateur = new Ordinateur(500, 16, "MonPC", "MarqueX", "ProcesseurY", "OSZ");
    }

    @Test
    public void testAjouterAccessoire() {
        Accessoires clavier = new Accessoires("Clavier", "noir", "avec fil", 30.0);

        // Ajouter l'accessoire à l'ordinateur
        ordinateur.ajouterAccessoire(clavier);

        // Vérifier que la liste d'accessoires contient l'accessoire ajouté
        assertTrue(ordinateur.getAccessoiresList().contains(clavier));
    }

    @Test
    public void testSupprimerAccessoire() {
        Accessoires souris = new Accessoires("Souris", "noir", "sans fil", 20.0);

        // Ajouter l'accessoire à l'ordinateur
        ordinateur.ajouterAccessoire(souris);

        // Vérifier que la liste d'accessoires contient l'accessoire ajouté
        assertTrue(ordinateur.getAccessoiresList().contains(souris));

        // Supprimer l'accessoire de l'ordinateur
        ordinateur.supprimerAccessoire(souris);

        // Vérifier que la liste d'accessoires ne contient plus l'accessoire supprimé
        assertFalse(ordinateur.getAccessoiresList().contains(souris));
    }

    @Test
    public void testGetAccessoiresList() {
        // Vérifier que la liste d'accessoires est initialement vide
        assertTrue(ordinateur.getAccessoiresList().isEmpty());

        // Créer des accessoires
        Accessoires clavier = new Accessoires("Clavier", "noir", "avec fil", 30.0);
        Accessoires souris = new Accessoires("Souris", "noir", "sans fil", 20.0);

        // Ajouter les accessoires à l'ordinateur
        ordinateur.ajouterAccessoire(clavier);
        ordinateur.ajouterAccessoire(souris);

        // Vérifier que la liste d'accessoires contient les accessoires ajoutés
        assertTrue(ordinateur.getAccessoiresList().contains(clavier));
        assertTrue(ordinateur.getAccessoiresList().contains(souris));
    }
    //TDD
    @Test
    public void testPrixTotalAccessoires() {
        // Créer un ordinateur
        Ordinateur monOrdinateur = new Ordinateur(500, 32, "Asus", "MarqueX", "ProcesseurY", "OSZ");

        // Créer des accessoires avec des prix
        Accessoires clavier = new Accessoires("Clavier", "noir", "avec fil", 30.0);
        Accessoires souris = new Accessoires("Souris", "noir", "sans fil", 20.0);

        // Ajouter des accessoires à l'ordinateur
        monOrdinateur.ajouterAccessoire(clavier);
        monOrdinateur.ajouterAccessoire(souris);

        // Test TDD : Vérifier que le prix total des accessoires est correct
        double prixTotalAttendu = 50.0; // Prix du clavier + Prix de la souris
        double prixTotalObtenu = monOrdinateur.getPrixTotalAccessoires();
        assertEquals("Le prix total des accessoires devrait être correct", prixTotalAttendu, prixTotalObtenu, 0.01); // Utiliser delta pour la comparaison des doubles
    }


}
