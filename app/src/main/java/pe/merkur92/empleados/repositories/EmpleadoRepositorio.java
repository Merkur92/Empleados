package pe.merkur92.empleados.repositories;

import java.util.ArrayList;
import java.util.List;

import pe.merkur92.empleados.models.Empleado;

public class EmpleadoRepositorio {
    private static List<Empleado> empleados = new ArrayList<>();
    static {
        empleados.add(new Empleado(1, "Robert Mac", "ingeniero", "rob.mac@gmail.com", 934563235 ));
        empleados.add(new Empleado(2, "Nando Window", "contador", "nando@gmail.com", 934563456 ));
        empleados.add(new Empleado(3, "Peter Vodafone", "abogado", "peter@gmail.com", 956863235 ));
        empleados.add(new Empleado(4, "Junior Clark", "medico", "junior@gmail.com", 934783235 ));
        empleados.add(new Empleado(5, "Elmer Infanti", "administrador", "elmer@gmail.com", 934570235 ));
        empleados.add(new Empleado(2, "Nando Window", "contador", "nando@gmail.com", 934563456 ));
        empleados.add(new Empleado(3, "Peter Vodafone", "abogado", "ruth@gmail.com", 956863235 ));
        empleados.add(new Empleado(4, "Junior Clark", "medico", "lidia@gmail.com", 934783235 ));
    }
    public static List<Empleado> getEmpleados(){
        return empleados;
    }
}
