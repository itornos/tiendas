package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Component;
import javax.swing.JOptionPane;

import SQL.Conexion;

public class Cliente {
    int tienda;
    String DNI;
    String name;
    String direccion;
    String telefono;

    public Cliente(int tienda,String DNI,String name,String direccion,String telefono){
        this.tienda = tienda;
        this.DNI = DNI;
        this.name = name;
        this.direccion = direccion;
        this.telefono = telefono;
    }  

    public boolean setDNI(String DNI){

        String prueba = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (prueba.charAt(Integer.parseInt(DNI.substring(0, 8))%23) == DNI.charAt(8)) {
            this.DNI = DNI; 
            return true;
        } 
        
        return false;
    }

    public boolean setTelefono(String tlf) {
        if (tlf.length() == 9) {
            this.telefono = tlf;
            return true;
        }
        return false;
    }

    public static String[][] get(String tienda) {
        int cant = 0;
        String[][] client = new String[getNumRows(tienda)][5];

        String sql = "SELECT id_cliente id, DNI, cliente.nombre, direccion, telefono FROM `cliente` join tienda USING (id_tienda) where upper(tienda.nombre)=upper('"+tienda+"');";
        try {
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while (match.next()) {
                client[cant][0] = match.getString("id").toLowerCase();
                client[cant][1] = match.getString("DNI").toLowerCase();
                client[cant][2] = match.getString("nombre").toLowerCase();
                client[cant][3] = match.getString("direccion").toLowerCase();
                client[cant][4] = match.getString("telefono").toLowerCase();
                cant++;
            }
        } catch (SQLException e) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Fallo con la recuperancion de Clientes","Error Tienda",JOptionPane.ERROR_MESSAGE);
        }
        return client;
    }

    public static int getNumRows(String tienda) {
        try {
            String sql = "SELECT count(*) num FROM cliente join tienda USING (id_tienda) where upper(tienda.nombre)=upper('"+tienda+"');";
            ResultSet match = Conexion.stmt.executeQuery(sql);
            match.next();
            return match.getInt("num"); 
        } catch (SQLException e1) {}
        return 0;
    }
}
