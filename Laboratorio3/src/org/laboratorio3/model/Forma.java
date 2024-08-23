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
abstract class Forma {
    private String color;

    public Forma() {
    }
    
    public Forma(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Forma{" + "color=" + color + '}';
    }
    
    abstract void calcularArea();
    
    public void calcularArea(String mensaje){
    }
    
}
