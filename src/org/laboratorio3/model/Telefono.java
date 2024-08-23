package org.laboratorio3.model;

/**
 *
 * @author informatica
 */
public class Telefono extends Dispositivo {
    private String tipo;

    public Telefono() {
    }

    public Telefono(String tipo, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.tipo = tipo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
