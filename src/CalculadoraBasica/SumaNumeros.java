package CalculadoraBasica;

import java.util.Scanner;
public class SumaNumeros {
	
	//comentario de modificacionnn
	//Cambio realizado desde rama feature-suma
	//Comentario despues de la fusion

	/**
	 * esta codigo suma dos numeros, el usuario pone dos numeros y te dice cuanto es la suma
	 * 
	 * @author Mariano
	 * @version 1.0 
	 */
public static void main(String[] args) {
	/**
     * basicamente pide dos numeros los suma y te lo muestra
     */

//para leer lo que el usuario escribe usamos scanner 
Scanner scanner = new Scanner(System.in);

//pedimos el primer numero 
System.out.print("Ingresa el primer número: ");
int numero1 = scanner.nextInt();
//pedimos el segundo numero 
System.out.print("Ingresa el segundo número: ");
int numero2 = scanner.nextInt();
//sumamos los numeros 
int suma = numero1 + numero2;
// mostramos el resultado
System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
}
}