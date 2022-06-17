package Datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.Component;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import SQL.Conexion;

public class Producto {
    String name;
    int precio;
    String descripcion;
    String caracteristicas;
    String acciones;
    String img;
    int idCategoria;
    int idSubCategoria;
    int idProveedor;
    int idTienda;
    private static Component frame = null;

    public Producto(String name,int precio,String descripcion,String caracteristicas,String acciones,String img,int idCategoria,String idSubCategoria,int idProveedor,int idTienda){
        this.name = name;
        this.precio = precio;
        this.descripcion = descripcion;
        setCaracteristicas(caracteristicas);
        setAcciones(acciones);
        setImg(img);
        this.idCategoria = idCategoria;
        setIdSubCategoria(idSubCategoria);
        this.idProveedor = idProveedor;
        this.idTienda = idTienda;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas.replace("\n", ",").replace("\r", ",");;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones.replace("\n", ",").replace("\r", ",");;
    }

    public void setImg(String img) {
        this.img = img.replace("\n", ",").replace("\r", ",");
    }

    public void setIdSubCategoria(String idSubCategoria) {
        try {
            this.idSubCategoria = Integer.parseInt(idSubCategoria);
        } catch (Exception e) {} 
    }

    public static String[][] getAll(String tienda) {
        int cant = 0;
        String[][] product = new String[getNumRows(tienda)][6];

        String sql = "SELECT producto.id_producto id,producto.nombre_producto prod,categoria.nombre cat,subcategoria.nombre subcat,precio,proveedor.nom_prov prov FROM `producto` inner join categoria USING (id_categoria) inner join subcategoria USING (id_subcategoria) inner join tienda USING (id_tienda) inner join proveedor USING (id_proveedor) where producto.id_tienda = 1 ORDER by id_producto asc;";
        try {
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while (match.next()) {
                product[cant][0] = match.getString("id").toLowerCase();
                product[cant][1] = match.getString("prod").toLowerCase();
                product[cant][2] = match.getString("precio").toLowerCase();
                product[cant][3] = match.getString("cat").toLowerCase();
                product[cant][4] = match.getString("subcat").toLowerCase();
                product[cant][5] = match.getString("prov").toLowerCase();
                cant++;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Fallo con la recuperancion de Productos","Error Tienda",JOptionPane.ERROR_MESSAGE);
        }
        return product;
    }

    public static String[] getName(String tienda) {
        String[] listado = new String[getNumRows(tienda)];
        int cont =0;
        try {
            String sql = "SELECT nombre_producto FROM `producto` where id_tienda=upper"+Tienda.getId(tienda)[0]+";";
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while (match.next()) {
                listado[cont] = match.getString("nombre_producto");
                cont++;
            }
        } catch (SQLException e1) {}
        return listado;
    }

    public static String[] getId(String tienda) {
        String[] listado = new String[getNumRows(tienda)];
        int cont =0;
        try {
            String sql = "SELECT id_producto FROM `producto` join tienda USING (id_tienda) where upper(tienda.nombre)=upper('"+tienda+"');";
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while (match.next()) {
                listado[cont] = match.getString("id_producto");
                cont++;
            }
        } catch (SQLException e1) {}
        return listado;
    }

    public static int getNumRows(String tienda) {
        try {
            String sql = "SELECT count(*) num FROM producto where producto.id_tienda="+Tienda.getId(tienda)[0]+";";
            ResultSet match = Conexion.stmt.executeQuery(sql);
            match.next();
            return match.getInt("num"); 
        } catch (SQLException e1) {}
        return 0;
    }

    public static String[] getSingle(String id) {
        String[] product = new String[9];

        String sql = "SELECT producto.imgs img, producto.Accesorios_incluidos acc, producto.descripcion des, producto.características_especificaciones carac, producto.nombre_producto prod,categoria.id_categoria cat,subcategoria.id_subcategoria subcat,precio,proveedor.id_proveedor prov FROM `producto` inner join categoria USING (id_categoria) inner join subcategoria USING (id_subcategoria) inner join tienda USING (id_tienda) inner join proveedor USING (id_proveedor) where upper(producto.id_producto)=upper('"+id+"');";
        try {
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while (match.next()) {
                product[0] = match.getString("des").toLowerCase();
                product[1] = match.getString("prod").toLowerCase();
                product[2] = match.getString("precio").toLowerCase();
                product[3] = match.getString("cat").toLowerCase();
                product[4] = match.getString("subcat").toLowerCase();
                product[5] = match.getString("prov").toLowerCase();
                product[6] = match.getString("carac").toLowerCase();
                product[7] = match.getString("img").toLowerCase();
                product[8] = match.getString("acc").toLowerCase();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Fallo con la recuperancion de Productos","Error Tienda",JOptionPane.ERROR_MESSAGE);
        }
        return product;
    }

    public static String[] get(String id) {
        String[] product = new String[9];

        String sql = "SELECT producto.imgs img, producto.Accesorios_incluidos acc, producto.descripcion des, producto.características_especificaciones carac, producto.nombre_producto prod,categoria.nombre cat,subcategoria.nombre subcat,precio,proveedor.nom_prov prov FROM `producto` inner join categoria USING (id_categoria) inner join subcategoria USING (id_subcategoria) inner join tienda USING (id_tienda) inner join proveedor USING (id_proveedor) where upper(producto.id_producto)=upper('"+id+"');";
        try {
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while (match.next()) {
                product[0] = match.getString("des").toLowerCase();
                product[1] = match.getString("prod").toLowerCase();
                product[2] = match.getString("precio").toLowerCase();
                product[3] = match.getString("cat").toLowerCase();
                product[4] = match.getString("subcat").toLowerCase();
                product[5] = match.getString("prov").toLowerCase();
                product[6] = match.getString("carac").toLowerCase();
                product[7] = match.getString("img").toLowerCase();
                product[8] = match.getString("acc").toLowerCase();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Fallo con la recuperancion de Productos","Error Tienda",JOptionPane.ERROR_MESSAGE);
        }
        return product;
    }

    public void Insert(Producto p){
        String sql = "INSERT INTO `producto` (`nombre_producto`, `precio`, `descripcion`, `características_especificaciones`, `Accesorios_incluidos`, `imgs`, `id_categoria`, `id_subcategoria`, `id_proveedor`, `id_tienda`) VALUES ('"+p.name+"', '"+p.precio+"', '"+p.descripcion+"', '"+p.caracteristicas+"', '"+p.acciones+"', '"+p.img+"', '"+p.idCategoria+"', '"+p.idSubCategoria+"', '"+p.idProveedor+"', '"+p.idTienda+"')";
        try {
            Conexion.stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(frame, "Producto insertado","Producto insertado",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Fallo insertar","Fallo al insertar el producto",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Update(Producto p,String id){
        String sql = "UPDATE `producto` SET `nombre_producto` = '"+p.name+"', `precio` = '"+p.precio+"', `descripcion` = '"+p.descripcion+"', `características_especificaciones` = '"+p.caracteristicas+"', `Accesorios_incluidos` = '"+p.acciones+"', `imgs` = '"+p.img+"', `id_categoria` = '"+p.idCategoria+"', `id_subcategoria` = '"+p.idSubCategoria+"', `id_proveedor` = '"+p.idProveedor+"' WHERE `producto`.`id_producto` = "+id+"";
        try {
            Conexion.stmt.executeUpdate(sql);

            JOptionPane.showMessageDialog(frame, "Producto editado","Producto editado",JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Fallo editar","Fallo al editar el producto",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void Delete(String id){
        String sql = "DELETE FROM `producto` WHERE `producto`.`id_producto` = "+id+"";
        try {
            Conexion.stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(frame, "Producto borrardo","Producto borrado",JOptionPane.WARNING_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Fallo borrar","Fallo al borrar el producto",JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void Import(ArrayList<String[]> list){
        for (String[] i : list) {
            Producto p = new Producto(i[0], Integer.parseInt(i[1]), i[2], i[3], i[4], i[5], Integer.parseInt(i[6]), i[7], Integer.parseInt(i[8]), Integer.parseInt(i[9]));
            try {
                String sql = "INSERT INTO `producto` (`nombre_producto`, `precio`, `descripcion`, `características_especificaciones`, `Accesorios_incluidos`, `imgs`, `id_categoria`, `id_subcategoria`, `id_proveedor`, `id_tienda`) VALUES ('"+p.name+"', '"+p.precio+"', '"+p.descripcion+"', '"+p.caracteristicas+"', '"+p.acciones+"', '"+p.img+"', '"+p.idCategoria+"', '"+p.idSubCategoria+"', '"+p.idProveedor+"', '"+p.idTienda+"')";
                Conexion.stmt.executeUpdate(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Fallo Importar","Fallo al importar el producto llamado "+p.name+"",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(frame, "Importacion de productos","Productos Importados",JOptionPane.INFORMATION_MESSAGE);
    } 
    
    public static void Export(String id,FileWriter fichero){
        
        try {
            fichero.write("id_producto"+"\t"+"nombre"+"\t"+"precio"+"\t"+"descripcion"+"\t"+"caracteristicas"+"\t"+"accesorios"+"\t"+"imgs"+"\t"+"id_categoria"+"\t"+"id_subcategoria"+"\t"+"id_proveedor"+"\t"+"id_tienda"+"\n");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Fallo con la escritura de Productos","Error Exportar datos",JOptionPane.ERROR_MESSAGE);
            return;
        } 
        String sql = "SELECT * from producto where id_tienda="+Tienda.getId(id)[0]+";";
        try {
            ResultSet match = Conexion.stmt.executeQuery(sql);
            while (match.next()) {
                Producto p = new Producto(match.getString("nombre_producto").toLowerCase(), match.getInt("precio"), match.getString("descripcion").toLowerCase(), match.getString("características_especificaciones").toLowerCase(), match.getString("Accesorios_incluidos").toLowerCase(), match.getString("imgs").toLowerCase(), match.getInt("id_categoria"), match.getString("id_subcategoria").toLowerCase(), match.getInt("id_proveedor"), match.getInt("id_tienda"));
                try {
                    fichero.write(match.getInt("id_producto")+"\t"+p.name+"\t"+p.precio+"\t"+p.descripcion+"\t"+p.caracteristicas+"\t"+p.acciones+"\t"+p.img+"\t"+p.idCategoria+"\t"+p.idSubCategoria+"\t"+p.idProveedor+"\t"+p.idTienda+"\n");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(frame, "Fallo con la escritura de Productos","Error Exportar datos",JOptionPane.ERROR_MESSAGE);
                    return;
                } 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Fallo con la recuperancion de Productos","Error Tienda",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            fichero.close();
            JOptionPane.showMessageDialog(frame, "Datos Exportados","Productos Exportados",JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {}
    }
}
