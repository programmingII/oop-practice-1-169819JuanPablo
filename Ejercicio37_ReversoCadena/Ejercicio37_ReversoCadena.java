/**
*Nombre: Juan Pablo Martinez
*Fecha: 24/02/2019
*Hora: 7:14 PM
*/

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

class Ejercicio37{
	public static void main(String args[]){
		Scanner t=new Scanner(System.in);	
		System.out.print("Ingrese una oracion: ");
		//Declaramos una variable de tipo string llamada word
		//En la variable almacenaremos una cadena de caracteres 
		String word=t.nextLine();
		//Convertimos la cadena String en una secuencia de caracteres utilizando el metodo toCharArray
        	// Utilizamos un array de tipo char, para almacenar los caracteres del String
        	char[] achar = word.toCharArray(); 
  		//Utilizamos un ciclo for para realizar el intercambiado de caracteres
		//Utilizamos el parametro .length para calcular el tamaño total de los caracteres almacenados en el array y lo asignamos a la variable i
		//Le restamos -1 al tamaño del array cada vez que se intercambie un valor
		//El ciclo terminara cuando i sea igual o mayor a 0
 	        for (int i = achar.length-1; i>=0; i--) 
		//Cada vez que se decreente en 1 el valor del tamaño de la variable i
		//se le asignara el caracter asociado de dicha posicion a la posicion siguiente del array
                System.out.print(achar[i]); 		
}
}