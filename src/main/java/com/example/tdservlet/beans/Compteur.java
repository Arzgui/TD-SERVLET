package com.example.tdservlet.beans;

public class Compteur{
 private int cpt = 0;


 public void increment (){
       cpt++;
    }

    public int getCpt() {
        return cpt;
    }

    public void setCpt(int cpt) {
        this.cpt = cpt;
    }

    public void setCount(int value) { // Use a descriptive parameter name
        if (value < 0) {
            throw new IllegalArgumentException("Count cannot be negative.");
        }
        this.cpt = value;
    }
}
