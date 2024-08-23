package org.laboratorio3.model;


public class Desarrollador extends Empleado{
    private String lenguajeProgramacion;

    public Desarrollador() {
    }

    public Desarrollador(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public Desarrollador(String lenguajeProgramacion, String nombre, int edad, int salario) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    void trabajar() {
        String proyecto;
    }
    
}
