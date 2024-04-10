package com.example.dammak_mohamed_amine_mesure_glycemie.model;

import android.util.Log;
import android.widget.Toast;

import com.example.dammak_mohamed_amine_mesure_glycemie.view.MainActivity;

public class Patient {
   private int age;
   private float valeurMesuree;
   private boolean isFasting;
   private String result;

    // Fleche "Update" Controller --> Model


    public Patient(int age, float valeurMesuree, boolean isFasting) {
        this.age = age;
        this.valeurMesuree = valeurMesuree;
        this.isFasting = isFasting;
        setResult();
    }

    private void setResult() {

            if(isFasting){
                if(age>= 13)
                    if(valeurMesuree< 5.0)
                        result = "Niveau de glycémie est trop bas";
                    else if(valeurMesuree>= 5.0 && valeurMesuree <= 7.2)
                        result = "Niveau de glycémie est normal";
                    else
                        result = "Niveau de glycémie est trop élevé";
                else if(age>= 6 && age <= 12)
                    if(valeurMesuree< 5.0)
                        result = "Niveau de glycémie est bas";
                    else if(valeurMesuree>= 5.0 && valeurMesuree <= 10.0)
                        result = "Niveau de glycémie est normal";
                    else
                        result = "Niveau de glycémie est trop élevé";
                else if(age < 6)
                    if(valeurMesuree< 5.5)
                        result = "Niveau de glycémie est bas";
                    else if(valeurMesuree>= 5.5 && valeurMesuree <= 10.0)
                        result = "Niveau de glycémie est normal";
                    else
                        result = "Niveau de glycémie est trop élevé";
            } else {
                if (valeurMesuree > 10.5)
                    result = "Niveau de glycémie est trop élevé";
                else
                   result = "Niveau de glycémie est normale";
            }
        }


    // Fleche "Notify" Model --> Controller


    public String getResult() {
        return result;
    }
}

