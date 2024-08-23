/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.laboratorio3.model;

/**
 *
 * @author informatica
 */
public class Rectangulo extends Forma{
    private int largo, ancho;

    public Rectangulo() {
    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public Rectangulo(int largo, int ancho, String color) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }
    
    
     public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    
    @Override
    void calcularArea() {
    }
    
    public void calcularArea(double ajuste){
        
    }
}
