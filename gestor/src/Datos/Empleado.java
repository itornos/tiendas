package Datos;

public class Empleado {
    String DNI;
    String name;
    String apellido;
    int antiguedad;
    int salario;

    public boolean setDNI(String DNI){

        String prueba = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (prueba.charAt(Integer.parseInt(DNI.substring(0, 8))%23) == DNI.charAt(8)) {
            this.DNI = DNI; 
            return true;
        } 
        
        return false;
    }
    
}
