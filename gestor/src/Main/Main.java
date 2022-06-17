package Main;
import Menus.Sesion;
import SQL.Conexion;

public class Main {

	public static void main(String[] args) {
	
		Conexion conex = new Conexion();
		conex.sesion();
		Sesion.ejecutar();
	}

}