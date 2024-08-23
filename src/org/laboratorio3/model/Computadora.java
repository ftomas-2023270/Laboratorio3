package org.laboratorio3.model;

/**
 *
 * @author informatica
 */
public class Computadora extends Dispositivo {
    private String sistemaOperativo;

    public Computadora() {
    }

    public Computadora(String sistemaOperativo, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    
   
}
