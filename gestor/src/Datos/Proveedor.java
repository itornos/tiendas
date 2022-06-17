package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Component;
import javax.swing.JOptionPane;

import SQL.Conexion;

public class Proveedor {
   String nif;
   String name;
   String pais;
   String direccion;
   String telefono;
   String representante;
   String encargado;
   String telefonoEncargado; 

    public boolean setNif(String nif) {
        String prueba = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (prueba.charAt(Integer.parseInt(nif.substring(0, 8))%23) == nif.charAt(8)) {
            this.nif = nif; 
            return true;
        } 
        
        return false;
    }

    public boolean setTelefono(String telefono) {
        if (telefono.length() == 9) {
            this.telefono = telefono;
            return true;
        }
        return false;
    }

    public boolean setTelefonoEncargado(String telefonoEncargado) {
        if (telefonoEncargado.length() == 9) {
            this.telefonoEncargado = telefonoEncargado;
            return true;
        }
        return false;
    }

    public static String[][] get(String tienda) {
        int cant = 0;
        String[][] client = new String[getNumRowsFromShop(tienda)][9];
        String sql = "SELECT DISTINCT id_proveedor id, nif, nom_prov, pais, direccion, telefono, representante, contacta_prov.idioma idioma, empleado.id_empleado empleado FROM `proveedor` INNER join producto USING(id_proveedor) INNER join contacta_prov USING(id_proveedor) INNER join empleado USING(id_empleado) join tienda USING (id_tienda) where upper(tienda.nombre)=upper('"+tienda+"');";
      
        try {
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while (match.next()) {
                client[cant][0] = match.getString("id").toLowerCase();
                client[cant][1] = match.getString("nif").toLowerCase();
                client[cant][2] = match.getString("nom_prov").toLowerCase();
                client[cant][3] = match.getString("pais").toLowerCase();
                client[cant][4] = match.getString("direccion").toLowerCase();
                client[cant][5] = match.getString("telefono").toLowerCase();
                client[cant][6] = match.getString("representante").toLowerCase();
                client[cant][7] = match.getString("idioma").toLowerCase();
                client[cant][8] = match.getString("empleado").toLowerCase();
                cant++;
            }
        } catch (SQLException e) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Fallo con la recuperancion de Clientes","Error Tienda",JOptionPane.ERROR_MESSAGE);
        }
        return client;
    }

    public static int getNumRowsFromShop(String tienda) {
        int cont=0;
        try {
            String sql = "SELECT DISTINCT proveedor.id_proveedor FROM `proveedor` INNER join producto USING(id_proveedor) join tienda USING (id_tienda) where upper(tienda.nombre)=upper('"+tienda+"');";
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while(match.next()){
                cont++;
            }
        } catch (SQLException e1) {}
        return cont;
    }

    public static int getNumRows(String tienda) {
        int cont=0;
        try {
        String sql = "SELECT proveedor.id_proveedor FROM `proveedor`";
        ResultSet match = Conexion.stmt.executeQuery(sql);
        while(match.next()){
            cont++;
        }
        } catch (SQLException e1) {}
        return cont;
    }

    public static String[] getId(String tienda) {
        String [] lista = new String[getNumRows(tienda)];
        int cont=0;
        try {
            String sql = "SELECT id_proveedor FROM `proveedor` order by id_proveedor asc";
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while(match.next()){
                lista[cont]= match.getString("id_proveedor");
                cont++;
            }
            
        } catch (SQLException e1) {}
        return lista;
    }
}
