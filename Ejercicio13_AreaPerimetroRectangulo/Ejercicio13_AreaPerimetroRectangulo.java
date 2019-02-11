/**
*Nombre: Juan Pablo Martinez
*Fecha: 10/02/2019
*Hora: 6:22
*/

import java.util.Scanner;

class Ejercicio13{
	public static void main(String args[]){
		double width,height,area,perimeter;
		Scanner t=new Scanner(System.in);
		System.out.println("Ingrese el ancho del rectangulo: ");
		width=t.nextDouble();
		System.out.println("Ingrese la altura del rectangulo: ");
		height=t.nextDouble();
		area=width*height;
		perimeter=2*(width+height);
		System.out.println("El area del rectangulo es: "+area);
		System.out.println("El perimetro del rectangulo: "+perimeter);
}


}