/**
*Nombre: Juan Pablo Martinez
*Fecha: 24/02/2019
*Hora: 5:18 PM
*/

import java.util.Scanner;

class Ejercicio34{
	public static void main(String args[]){
		Scanner t=new Scanner(System.in);
		//Declaramos la variable area de tipo double para almacenar el valor calculado del area del hexagono
		double area;
		//Declaramos la variable length de tipo double, en donde se guardara el valor del lado del hexagono	
		//Se utiliza el tipo de dato double porque el valor puede ser tanto entero como decimal
		//Ingresamos el lado del hexagono
		System.out.print("Ingresa la longitud del lado del hexagono: ");
		double length=t.nextDouble();;
		//Realizamos la operacion para calcular el area
		area=((6*Math.pow(length,2))/(4*Math.tan(Math.PI/6)));
		//Imprimimos el resultado del area
		System.out.print("El area total del hexagono es: "+area);

}
}