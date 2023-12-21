package org.example.agilite;

public class Accessoires {


    public String nom;
    public String couleur;
    public String type;

    public double prix;


    public Accessoires(String nom, String couleur,String type, double prix) {
        this.nom = nom;
        this.couleur = couleur;
        this.prix = prix;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
