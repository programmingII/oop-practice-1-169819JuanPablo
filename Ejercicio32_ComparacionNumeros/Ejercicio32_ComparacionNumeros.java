/**
*Nombre: Juan Pablo Martinez
*Fecha: 21/02/2019
*Hora: 12:55 PM
*/

import java.util.Scanner;

class Ejercicio32{
	public static void main(String args[]){
		Scanner t=new Scanner(System.in);
		System.out.print("Ingrese el primer numero: ");
		int n1=t.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int n2=t.nextInt();

		if(n1==n2){
			System.out.println(n1+"=="+n2);
		}
		if(n1<n2){
			System.out.println(n1+"<"+n2);
		}
		if(n1>n2){
			System.out.println(n1+">"+n2);
		}
		if(n1<=n2){
			System.out.println(n1+"<="+n2);
		}
		if(n1>=n2){
			System.out.println(n1+">="+n2);
		}
		if(n1!=n2){
			System.out.println(n1+"!="+n2);
		}

}
}