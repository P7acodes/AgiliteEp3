package org.example.agilite;

import java.util.ArrayList;
import java.util.List;

public class Ordinateur {
    // instance variables
    private int stockage;
    private int ram;
    private String name;
    private String marque;
    private String processeur;
    private String systemeExploitation;

    private List<Accessoires> accessoiresList;



    public Ordinateur(int stockage, int ram, String name, String marque, String processeur, String systemeExploitation) {
        this.stockage = stockage;
        this.ram = ram;
        this.name = name;
        this.marque = marque;
        this.processeur = processeur;
        this.systemeExploitation = systemeExploitation;
        this.accessoiresList = new ArrayList<>();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getProcesseur() {
        return processeur;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    public String getSystemeExploitation() {
        return systemeExploitation;
    }

    public void setSystemeExploitation(String systemeExploitation) {
        this.systemeExploitation = systemeExploitation;
    }


    // Getter for stockage
    public int getStockage()
    {
        return stockage;
    }

    // Setter for stockage
    public void setStockage(int stockage)
    {
        this.stockage = stockage;
    }

    // Getter for ram
    public int getRam()
    {
        return ram;
    }

    // Setter for ram
    public void setRam(int ram)
    {
        this.ram = ram;
    }




    // Ajouter un accessoire à la liste
    public void ajouterAccessoire(Accessoires accessoire) {
        extracted(accessoire);
    }

    private void extracted(Accessoires accessoire) {
        accessoiresList.add(accessoire);

    }

    // Supprimer un accessoire de la liste
    public void supprimerAccessoire(Accessoires accessoire) {
        accessoiresList.remove(accessoire);
    }

    // Obtenir la liste complète des accessoires
    public List<Accessoires> getAccessoiresList() {
        return accessoiresList;
    }

    public double getPrixTotalAccessoires() {
        double prixTotalAccessoires = 0.0;

        // Ajouter le prix de chaque accessoire
        for (Accessoires accessoire : accessoiresList) {
            prixTotalAccessoires += accessoire.getPrix();
        }

        return prixTotalAccessoires;
    }

}
