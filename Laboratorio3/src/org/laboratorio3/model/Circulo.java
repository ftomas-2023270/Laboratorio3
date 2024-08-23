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
public class Circulo extends Forma{
    private int radio;

    public Circulo() {
    }

    
    public Circulo(int radio, String color) {
        super(color);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
    @Override
    void calcularArea() {
    }
    
}
