package com.mario.presentacion;


import java.io.IOException;
import java.util.Scanner;
import com.mario.negocio.LogicaNegocio;


public class Vista {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce el nombre de la persona que quieres conocer cuantos coches tiene" + "\n");
		String nombre = sc.next();
		LogicaNegocio n = new LogicaNegocio();
		try {
			System.out.println(" El numero de coches es: " + n.calculaCoches(nombre) );
		} catch (IOException e) {
			e.printStackTrace();
		}
			sc.close();
	}

}


	
