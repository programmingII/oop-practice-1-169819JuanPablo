/**
*Juan Pablo Martinez
*07/02/2019
*12:17
*/
import java.util.Scanner;

class Ejercicio3{
	public static void main (String[] args){
		//Declaramos las variables de tipo entero
		int v1,v2;
		//Creamos un objeto de la clase Scanner que leera los datos de entrata por el teclado
		Scanner t=new Scanner(System.in);
		//Usamos System.out.print para imprimir un valor en pantalla
		System.out.print("Introduzca num 1: \n");
		//Leemos el valor de tipo entero ingresado por teclado
		v1= t.nextInt();
		//Leemos el segundo valor 
		System.out.print("Introduzca num 2: \n");
		v2= t.nextInt();
		//Dividimos las dos variables y las imprimimos
		System.out.print(v1+"/"+v2+"="+(v1/v2));
		
}
}