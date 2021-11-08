/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exersise.singleton;

/**
 *
 * @author Marko
 */
public class Vuoronumero {
    private int numero;
    private static Vuoronumero INSTANCE = null;
    
    private Vuoronumero () {
        
    }
    
    public static Vuoronumero getInstance () {
        if (INSTANCE == null) {
            INSTANCE = new Vuoronumero();
        }
        return INSTANCE;
    }
    
    public int getNumero () {
        return numero;
    }
    
    public void setNumero (int numero) {
        this.numero = numero;
    }
}
