/**
*Nombre: Juan Pablo Martinez
*Fecha: 10/02/2019
*Hora: 5:31
*/

import java.util.Scanner;


class Ejercicio11{
	public static void main(String args[]){
		double radius,perimeter,area;
		Scanner t=new Scanner(System.in);
		System.out.println("Ingrese el radio del circulo");
		radius=t.nextDouble();
		area=(Math.PI*(radius*radius));
		perimeter=(2*Math.PI*radius);
		System.out.println("El area del circulo es: "+area);
		System.out.println("La circuferencia del circulo es: "+perimeter);
}
}