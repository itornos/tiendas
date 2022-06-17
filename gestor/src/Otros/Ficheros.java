package Otros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Component;

import javax.swing.JOptionPane;

public class Ficheros {

	private static Component frame = null;

    public static ArrayList<String[]> leer(File fichero) {
		
		BufferedReader leer = null;//leer el fichero
        String texto;//texto leido
		ArrayList<String[]> lista = new ArrayList<String[]>();//guardar linea leida

		//buscar fichero
		try {

			leer = new BufferedReader(new FileReader(fichero));

		} catch (Exception e) {
			System.out.println("Se ha producido algun problema con el fichero");
		}

        //leer fichero
		try {
				while((texto = leer.readLine()) != null){
					String[] atributos = texto.split("\t");
					lista.add(atributos);				
				}			

		}catch(Exception e) {

			System.out.println("Error de lectura del fichero");

		}

		return lista;
	}

	public static FileWriter escritura(File f) {
		try {
			FileWriter  fichero = new FileWriter(f);
			return fichero;
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(frame, "Fallo con la recuperancion del fichero","Error Exportar Producto",JOptionPane.ERROR_MESSAGE);
		}
		return null;
	}
}
