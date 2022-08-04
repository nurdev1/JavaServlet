/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.octect.beans;

/**
 *
 * @author fssy
 */
public class User {
    private String nom;
    private String prenom;
    private String speudo;
    private String email;
    private String motDePasse;

    public User(String nom, String prenom, String speudo, String email, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.speudo = speudo;
        this.email = email;
        this.motDePasse=motDePasse;
    }

    public User() {
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpeudo() {
        return speudo;
    }

    public void setSpeudo(String speudo) {
        this.speudo = speudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
    
    
}
