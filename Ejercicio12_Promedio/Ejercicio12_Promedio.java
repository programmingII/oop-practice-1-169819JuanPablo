/**
*Nombre: Juan Pablo Martinez
*Fecha: 10/02/2019
*Hora: 6:05
*/

import java.util.Scanner;

class Ejercicio12{
	public static void main(String args[]){
		double v1,v2,v3,prom;
		Scanner t=new Scanner(System.in);
		System.out.println("Ingrese el valor 1: ");
		v1=t.nextDouble();
		System.out.println("Ingrese el valor 2: ");
		v2=t.nextDouble();
		System.out.println("Ingrese el valor 3: ");
		v3=t.nextDouble();
		prom=(v1+v2+v3)/3;
		System.out.println("El promedio de los tres valores es: "+prom);
}
}