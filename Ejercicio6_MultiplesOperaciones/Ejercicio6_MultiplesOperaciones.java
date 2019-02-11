/**
*Nombre: Juan Pablo Martinez
*Fecha: 10/02/2019
*Hora: 2:27
*/

import java.util.Scanner;

class Ejercicio6{
	public static void main(String[] args){
		//
		int v1,v2,sum,res,mul;
		double div,mod;
		Scanner t=new Scanner(System.in);
		System.out.print("Inserte el valor 1: \n");
		v1=t.nextInt();
		System.out.print("Inserte el valor 2: \n");
		v2=t.nextInt();
		sum=v1+v2;
		res=v1-v2;
		mul=v1*v2;
		div=v1/v2;
		mod=v1%v2;
		System.out.print("\n");
		System.out.println(v1 + " + " + v2 + " = " + sum);
		System.out.println(v1 + " - " + v2 + " = " + res);
		System.out.println(v1 + " * " + v2 + " = " + mul);
		System.out.println(v1 + " / " + v2 + " = " + div);
		System.out.println(v1 + " mod " + v2 + " = " + mod);
}
}