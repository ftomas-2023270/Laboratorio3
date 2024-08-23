package org.laboratorio3.system;

import org.laboratorio3.controller.EmpleadoController;
import org.laboratorio3.model.Desarrollador;


public class Main {


    public static void main(String[] args) {
        Desarrollador d = new Desarrollador();
        
        EmpleadoController s = new EmpleadoController();
        
        s.agregarEmpleados();
    }
    
}
