package Modelo;

import java.util.Scanner;

public class ModeloUno {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int hola=leer.nextInt();
		int min=0;
		int max=20;
		if(hola>max||hola<min)
			System.out.println("de eso na");
		else
			System.out.println("eso si");
	}
}
