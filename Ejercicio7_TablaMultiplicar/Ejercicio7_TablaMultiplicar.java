/**
*Nombre: Juan Pablo Martinez
*Fecha: 10/02/2019
*Hora: 4:17
*/

import java.util.Scanner;

class Ejercicio7{
	public static void main(String [] args){
		int v1,i;
		Scanner t = new Scanner(System.in);
		System.out.println("Inserte un numero para sacar su tabla de multiplicar:");
		v1=t.nextInt();
		for(i=0;i<=10;i++){
		System.out.println(v1 + "*" + i + "=" + (v1*i));
}
}

}