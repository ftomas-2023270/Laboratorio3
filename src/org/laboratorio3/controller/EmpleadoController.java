package org.laboratorio3.controller;

import org.laboratorio3.model.Desarrollador;
import org.laboratorio3.model.Empleado;
import org.laboratorio3.model.Tester;

public class EmpleadoController {
    
    Desarrollador desarrollador = new Desarrollador();
    Tester tester = new Tester();
    
    public void agregarEmpleados(){
        desarrollador.setNombre("Pedro");
        desarrollador.setEdad(22);
        desarrollador.setSalario(4000);
        desarrollador.setLenguajeProgramacion("Java");
        
        tester.setNombre("Cesar");
        tester.setEdad(25);
        tester.setSalario(5000);
        tester.setTipoPruebas("Actualizacion");
    
        System.out.println(desarrollador.toString());
    }
}
