package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import java.awt.Component;

import Menus.Sesion;
import SQL.Conexion;

public class Tienda {
    int admin;
    String name;
    String domain;

    public static String[] getId(String tienda) {
        String [] lista = new String[1];
        try {
            String sql = "SELECT id_tienda FROM `tienda` where nombre='"+tienda+"'";
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while(match.next()){
                lista[0]= match.getString("id_tienda");
            }
            
        } catch (SQLException e1) {}
        return lista;
    }

    public static String get(String user) {
        String sql = "SELECT * FROM tienda WHERE administrador = '"+user+"';";
        try {
            ResultSet match = Conexion.stmt.executeQuery(sql);
            match.next();
            return match.getString("nombre").toLowerCase();
        } catch (SQLException e) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "El usuario indicado no es Admin de ninguna tienda","Error Tienda",JOptionPane.ERROR_MESSAGE);
            Sesion.ejecutar();
        }
        return null;
    }
}
