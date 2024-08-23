package org.laboratorio3.model;


public class Tester extends Empleado{
    private String tipoPruebas;

    public Tester() {
    }

    public Tester(String tipoPruebas) {
        this.tipoPruebas = tipoPruebas;
    }

    public Tester(String tipoPruebas, String nombre, int edad, int salario) {
        super(nombre, edad, salario);
        this.tipoPruebas = tipoPruebas;
    }

    public String getTipoPruebas() {
        return tipoPruebas;
    }

    public void setTipoPruebas(String tipoPruebas) {
        this.tipoPruebas = tipoPruebas;
    }
    
    @Override
    public void trabajar() {
        System.out.println("El tester: " + getNombre() + " esta hacinedo este tipo"
                + " de pruebas " + getTipoPruebas());
    }
    
    @Override
    public void trabajar(int horas){
        System.out.print("El tester: " + getNombre() + " trabaja el numero de horas"
                + "de " + horas);
    }
    
    public void trabajar(String herramienta, String proyecto){
        System.out.println("El tester: " + getNombre() + " utilizo la herramienta "
        + herramienta + " para el proyecto de " + proyecto + "en la preuba de " 
                + getTipoPruebas());
    }
 
}
