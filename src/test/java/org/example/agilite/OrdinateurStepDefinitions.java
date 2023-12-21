package org.example.agilite;

import org.example.agilite.Accessoires;
import org.example.agilite.Ordinateur;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class OrdinateurStepDefinitions {

    private Ordinateur ordinateur;
    private Accessoires accessoire;
    private double prixTotal;

    @Given("un ordinateur existe avec le stockage {int}, la RAM {int}, le nom {string}, la marque {string}, le processeur {string}, et le système d'exploitation {string}")
    public void un_ordinateur_existe(int stockage, int ram, String nom, String marque, String processeur, String systemeExploitation) {
        ordinateur = new Ordinateur(stockage, ram, nom, marque, processeur, systemeExploitation);
    }

    @When("j'ajoute un accessoire nommé {string} de couleur {string}, de type {string}, et de prix {double} à l'ordinateur")
    public void j_ajoute_un_accessoire(String nom, String couleur, String type, double prix) {
        accessoire = new Accessoires(nom, couleur, type, prix);
        ordinateur.ajouterAccessoire(accessoire);
    }

    @When("je supprime l'accessoire nommé {string} de l'ordinateur")
    public void je_supprime_un_accessoire(String nom) {
        Accessoires accessoireASupprimer = ordinateur.getAccessoiresList()
                .stream()
                .filter(a -> a.getNom().equals(nom))
                .findFirst()
                .orElse(null);

        assertNotNull(accessoireASupprimer);
        ordinateur.supprimerAccessoire(accessoireASupprimer);
    }

    @Then("la liste d'accessoires de l'ordinateur devrait contenir {string}")
    public void la_liste_contient(String nomAccessoire) {
        assertTrue(ordinateur.getAccessoiresList().stream().anyMatch(a -> a.getNom().equals(nomAccessoire)));
    }

    @Then("la liste d'accessoires de l'ordinateur ne devrait pas contenir {string}")
    public void la_liste_ne_contient_pas(String nomAccessoire) {
        assertFalse(ordinateur.getAccessoiresList().stream().anyMatch(a -> a.getNom().equals(nomAccessoire)));
    }

    @Then("la liste devrait contenir {string} et {string}")
    public void la_liste_contient_et(String nomAccessoire1, String nomAccessoire2) {
        assertTrue(ordinateur.getAccessoiresList().stream().anyMatch(a -> a.getNom().equals(nomAccessoire1)));
        assertTrue(ordinateur.getAccessoiresList().stream().anyMatch(a -> a.getNom().equals(nomAccessoire2)));
    }

    @When("je calcule le prix total des accessoires de l'ordinateur")
    public void je_calcule_prix_total_accessoires() {
        prixTotal = ordinateur.getPrixTotalAccessoires();
    }

    @Then("le prix total devrait être {double}")
    public void le_prix_total_est(double prixAttendu) {
        assertEquals(prixAttendu, prixTotal, 0.01); // Utiliser delta pour la comparaison des doubles
    }
}

