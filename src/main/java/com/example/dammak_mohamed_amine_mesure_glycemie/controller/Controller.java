package com.example.dammak_mohamed_amine_mesure_glycemie.controller;

import com.example.dammak_mohamed_amine_mesure_glycemie.model.Patient;

public final class Controller {
    private static Patient patient;
    private static Controller instance = null;
    private Controller(){

        super();
    }

    public static Controller getInstance(){
        if(instance == null)
            instance = new Controller();
        return instance;
    }

    // Fleche userAction View --> Controller
    public void createPatient(int age, float valeurMesuree, boolean isFasting){
        // Fleche update  Controller --> Model
        patient = new Patient(age,valeurMesuree,isFasting);
    }

    // Fleche Notify  Controller --> View
    public String getResult(){
        // Fleche Notify  Model --> Controller
        return patient.getResult();
    }
}
