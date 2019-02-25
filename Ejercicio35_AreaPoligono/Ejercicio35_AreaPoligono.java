/**
*Nombre: Juan Pablo Martinez
*Fecha: 24/02/2019
*Hora: 5:38 PM
*/

import java.util.Scanner;

class Ejercicio35{
	public static void main(String args[]){
		Scanner t=new Scanner(System.in);
		//Declaramos la variable area de tipo double para almacenar el valor calculado del area del poligono
		double area;
		//Declaramos la variable length de tipo double, en donde se guardara el valor de la longitud de los lados del poligono	
		//Se utiliza el tipo de dato double porque el valor puede ser tanto entero como decimal
		//Declaramos la variable tipo int llamada n donde se almacenaran el numero de lados del poligono
		//Ingresamos el numero de lados del poligono
		System.out.print("Ingrese el numero de lados del poligono: ");
		int n=t.nextInt();
		//Ingresamos la longitud del lado del poligono
		System.out.print("Ingresa la longitud del lado del poligono: ");
		double length=t.nextDouble();;
		//Realizamos la operacion para calcular el area
		area=((n*Math.pow(length,2))/(4*Math.tan(Math.PI/n)));
		//Imprimimos el resultado del area
		System.out.print("El area total del poligono es: "+area);

}
}