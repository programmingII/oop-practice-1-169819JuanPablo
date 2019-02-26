/**
*Nombre: Juan Pablo Martinez
*Fecha: 25/02/2019
*Hora: 9:54 PM
*/

import java.util.Scanner;

class Ejercicio41{
	public static void main(String args[]){
		//Creamos un objeto de tipo Scanner utilizando la clase scanner para leer los datos desde el teclado
		Scanner t=new Scanner(System.in);
		//Imprimos el mensaje pidiendo cualquier caracter
		System.out.print("Ingrese un caracter: ");
		//Declaramos la variable character de tipo char
		//Leemos la variable utilizando el metodo nextLine
		//El metodo charAt nos permite regresar el primer caracter de acuerdo a la posicion en la que se especifique
		//Retornamos el primer caracter del String con el indice 0 (que es el primero)
		char character=t.nextLine().charAt(0);
		//Convertimos el caracter dado utilizando una variable de tipo int, esto hara que el caracter ingresado pase de ser char a tipo int
		int ascii=(int) character;
		//Imprimimos el resultado
		System.out.print("El caracter "+character+"a ASCII es: "+ascii);
}
}