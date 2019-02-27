/**
*Nombre: Juan Pablo Martinez
*Fecha: 26/02/2019
*Hora: 12:42 PM
*/

import java.util.Scanner;

class Ejercicio44{
	public static void main(String args[]){
		//Creamos un objeto de tipo Scanner para leer los datos ingresados por teclado
		Scanner t=new Scanner(System.in);
		//Declaramos una variable de tipo int llamada num y utilizamos el metodo nextInt para leer la variable de tipo int
		System.out.print("Ingrese un numero: ");
		int num=t.nextInt();
		//Imprimimos el formato n+nn+nnn concatenando cada numero utilizando el simbolo de +
		//Se encierra entre comillas un simbolo mas para representarla como tal en la impresion de pantalla
		System.out.print(num+"+"+(num)+(num)+"+"+(num)+(num)+(num));

}
}