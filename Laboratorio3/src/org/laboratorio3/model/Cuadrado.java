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
public class Cuadrado extends Forma{
    private int base, altura;

    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Cuadrado(int base, int altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    void calcularArea() {
    }
    
    public void calcularArea(double ajuste){
        
    }
   
}
