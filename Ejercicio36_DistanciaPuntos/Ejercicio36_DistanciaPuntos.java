/**
*Nombre: Juan Pablo Martinez
*Fecha: 24/02/2019
*Hora: 5:50 PM
*/

import java.util.Scanner;

class Ejercicio36{
	public static void main(String args[]){
		Scanner t=new Scanner(System.in);
		//Declaramos las variables de tipo double de la primera coordenada
		//Ingresamos los valores de la latitud y longitud de la primera coordenada, seran dos variables tipo double
		System.out.print("Ingresa la latitud de la coordenada x1: ");
		double x1=t.nextDouble();
		System.out.print("Ingresa la longitud de la coordenada y1: ");
		double y1=t.nextDouble();
		//Ingresamos los valores de la latitud y longitud de la segunda coordenada
		System.out.print("Ingresa la latitud de la coordenada x2: ");
		double x2=t.nextDouble();
		System.out.print("Ingresa la longitud de la coordenada y2: ");
		double y2=t.nextDouble();
		
		//Inicializamos la variable de radio de tipo double (ya que es decimal) con el valor de 6371.01 ya que es el valor del radio de la tierra
		double r=6371.01;
		
		//Convertimos los valores ingresados en Radianes utilizando la funcion toRadians de la clase Math
		//Se necesitan valores en radianes para poder utilizar la formula
		x1=Math.toRadians(x1);
		y1=Math.toRadians(y1);
		x2=Math.toRadians(x2);
		y2=Math.toRadians(y2);

		//Aplicamos la formula para calcular la distancia entre los dos puntos
		//Almacenamos el valor resultante de la operacion en la variable diameter de tipo double
		double diameter=(r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
		
		//Imprimimos del resultado final
		System.out.print("La distancia entre los dos puntos es: "+diameter+" KM");
				
}
}