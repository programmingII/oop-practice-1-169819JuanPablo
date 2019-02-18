/**
*Nombre: Juan Pablo Martinez 
*Fecha: 17/02/2019
*Hora: 7:00 PM
*/

//Llamamos a la clase Scanner del paquete java.util utilizando import
//Esta clase permite una lectura de datos mucho mas facil
import java.util.Scanner;

//Creamos la clase principal
class Ejercicio19{
	//Creamos la clase principal llamada main
	//Usamos el modificador de acceso public para que cualquier clase pueda acceder a la informacion de la misma clase
	//static indica que no se utilizara una instancia de clase para el acceso del metodo
	//el tipo de objeto sera void, el cual no regresara ningun valor
	//String args es el parametro del metodo principal, el cual contiene un array que contendra valors de tipo string
	//Tambien el parametro string args permite una lectura mas facil desde la consola de comandos
	public static void main(String args[]){
		//Creamos un objeto del tipo Scanner llamado t que leera los datos ingresados por el usuario desde el teclado
		Scanner t=new Scanner(System.in);
	
		//Declaramos la variable num de tipo int y leeremos el valor utilizando el metodo nextInt, el cual indicara el tipo de dato de la variable
		//A su vez leeremos el valor desde teclado utilizando el objeto Scanner
		System.out.print("Ingrese un numero decimal: ");
		int num=t.nextInt(); 

		//Imprimimos en pantalla el numero binario
		//Utilizamos la clase Integer para llamar el metodo toBinaryString para convertir el valor de num a binrio
		System.out.print("El numero "+num+" en binario es: "+Integer.toBinaryString(num));

}
}