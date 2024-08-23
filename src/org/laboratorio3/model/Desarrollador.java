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
    public void trabajar() {
        System.out.println("El desarrollador: " + getNombre() + " trabaja con el lenguaje"
                + " de programacion de " + getLenguajeProgramacion());
    }
    
    @Override
    public void trabajar(int horas){
        System.out.print("El desarrollador: " + getNombre() + " trabaja el numero de horas"
                + "de " + horas);
    }
    
    public void trabajar(String proyecto){
        System.out.println("El desarrollador: " + getNombre() + " utiliza para el"
                + " proyecto " + proyecto + "el lenguaje de programacion de  " 
                + getLenguajeProgramacion());
    }

    @Override
    public String toString() {
        return super.toString() + "{lenguajeProgramacion=" + lenguajeProgramacion + '}';
    }
    
    
}
