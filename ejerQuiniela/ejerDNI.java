package ejerQuiniela;
 /*
  * Ejercicio 2, DNI comprobacion
  * 05/10/2018
  * Yunyang Hu
  * 
  */
import java.util.*;
public class ejerDNI {
	public static Scanner sc = new Scanner(System.in);
	public static void compruebaNIF(String nif) {
		String letrasNif = "TRWAGMYFPDXBNJZSQVHLCKE";
		String nie = nif;
		if(nif.startsWith("x")) {
			nie = 0 + nif.substring(1,nif.length());
		}
		else if(nif.startsWith("y")) {
			nie = 1 + nif.substring(1,nif.length());
		}
		else if(nif.startsWith("z")) {
			nie = 2 + nif.substring(1,nif.length());
		} 
		int numero = Integer.parseInt(nie.substring(0, nie.length() - 1));
		String letra = nie.substring(nie.length() - 1, nie.length()).toUpperCase();
		char[] letraUser = letra.toCharArray();
		int pos = numero % 23;
		
		if(letrasNif.charAt(pos) == letraUser[0]) {
			System.out.println("El NIF " + nif + " es correcto");
		} else {
			System.out.println("El NIF " + nif + " es incorrecto.\nLa letra tendría que ser " + letrasNif.charAt(pos));
		}
	}
	public static void main(String[] args) {
		
		do {
		System.out.print("Introduce el NIF : ");
		String nif = sc.next();
		sc.nextLine();
		if(nif.equals("0")) {
			System.out.println("FIN DEL PROGRAMA");
			break;
		}
		compruebaNIF(nif);
		}
		while(true);
	}
}
