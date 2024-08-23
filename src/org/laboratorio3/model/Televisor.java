package org.laboratorio3.model;

/**
 *
 * @author informatica
 */
public class Televisor extends Dispositivo{
    private String tamanoPantalla;
    
    public Televisor(){
        
    }

    public Televisor(String tamanoPantalla, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(String tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }
    
    
    
    
}
