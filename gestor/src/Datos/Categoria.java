package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import SQL.Conexion;

public class Categoria {
    String name;
    ArrayList<String> img;

    public static String[] getId() {
        String [] lista = new String[getNumRows()];
        int cont=0;
        try {
            String sql = "SELECT id_categoria FROM `categoria`";
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while(match.next()){
                lista[cont]= match.getString("id_categoria");
                cont++;
            }
             
        } catch (SQLException e1) {}
        return lista;
    }

    private static int getNumRows() {
        try {
            String sql = "SELECT count(*) num FROM categoria";
            ResultSet match = Conexion.stmt.executeQuery(sql);
            match.next();
            return match.getInt("num"); 
        } catch (SQLException e1) {}
        return 0;
    }
}
