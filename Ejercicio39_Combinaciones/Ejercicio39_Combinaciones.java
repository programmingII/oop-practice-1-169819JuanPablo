/**
*Nombre: Juan Pablo Martinez
*Fecha: 24/02/2019
*Hora: 8:56 PM
*/

import java.util.Scanner;

class Ejercicio39{
	public static void main(String args[]){
		int count=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){
						if(k != i && k != j && i != j){ 
						count++;
						System.out.println(i+""+""+j+""+k);
					}
				}
			}
		}
		System.out.print("Numero total de combinaciones con tres numeros es: "+count);
}
}