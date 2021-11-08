/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exersise.singleton;

/**
 *
 * @author Marko
 */
public class Main {
    public static void main(String[] args) {
        
        // Singleton luokka huolehtii esimerkiksi vuoronumeroiden ylläpidosta
        System.out.println("Vuoronumero alussa: " + Vuoronumero.getInstance().getNumero());
        
        // lisätään uusi numero
        Vuoronumero.getInstance().setNumero(1);
        System.out.println("Vuoronumero: " + Vuoronumero.getInstance().getNumero());
        
        // lisätään uusi numero
        Vuoronumero.getInstance().setNumero(2);
        System.out.println("Vuoronumero: " + Vuoronumero.getInstance().getNumero());
        
        // lisätään uusi numero
        Vuoronumero.getInstance().setNumero(3);
        System.out.println("Vuoronumero lopussa: " + Vuoronumero.getInstance().getNumero());
    
    }
}
