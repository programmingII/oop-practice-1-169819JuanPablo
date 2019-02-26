/**
*Nombre: Juan Pablo Martinez
*Fecha: 24/02/2019
*Hora: 8:00 PM
*/

import java.util.Scanner;

class Ejercicio38{
	public static void main(String args[]){
		Scanner t=new Scanner(System.in);
		int countletter=0,countspace=0,countnumber=0,countother=0;

		System.out.print("Ingrese una oracion: ");
		String p=t.nextLine();

		char[] achar=p.toCharArray();

		for(int i=0;i<p.length();i++){
		
		if(Character.isLetter(achar[i])){
		countletter ++;
		}
		if(Character.isDigit(achar[i])){
		countnumber ++;
		}
		if(Character.isSpaceChar(achar[i])){
		countspace ++;
		}
		else {
		countother ++;
		}
		}
		System.out.println("La cadena " +p+ " contiene: ");
		System.out.println("Letras: " + countletter);
		System.out.println("Numeros: " + countnumber);
		System.out.println("Espacios: " + countspace);
		System.out.println("Otros simbolos: " + countother);
}
}