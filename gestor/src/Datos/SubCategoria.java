package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;

import SQL.Conexion;

public class SubCategoria {

    public static String[] getId(String id) {
        String [] lista = new String[getNumRows(id)+1];
        lista[0]="0";
        int cont=1;
        try {
            String sql = "SELECT id_subcategoria FROM `subcategoria` where id_categoria = "+id+"";
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while(match.next()){
                lista[cont]= match.getString("id_subcategoria");
                cont++;
            }
            
            
        } catch (SQLException e1) {}
        return lista;
    }

    private static int getNumRows(String id) {
        try {
            String sql = "SELECT count(*) num FROM subcategoria where id_categoria='"+id+"'";
            ResultSet match = Conexion.stmt.executeQuery(sql);
            match.next();
            return match.getInt("num"); 
        } catch (SQLException e1) {}
        return 0;
    }
}