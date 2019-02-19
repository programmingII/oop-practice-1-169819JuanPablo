/**
*Nombre: Juan Pablo Martinez 
*Fecha: 18/02/2019
*Hora: 9:50 PM
*/

//Llamamos a la clase Scanner del paquete java.util utilizando import
//Esta clase permite una lectura de datos mucho mas facil
import java.util.Scanner;

//Creamos la clase principal
class Ejercicio27{
	//Creamos la clase principal llamada main
	//Usamos el modificador de acceso public para que cualquier clase pueda acceder a la informacion de la misma clase
	//static indica que no se utilizara una instancia de clase para el acceso del metodo
	//el tipo de objeto sera void, el cual no regresara ningun valor
	//String args es el parametro del metodo principal, el cual contiene un array que contendra valors de tipo string
	//Tambien el parametro string args permite una lectura mas facil desde la consola de comandos
	public static void main(String args[]){
		//Creamos un objeto del tipo Scanner llamado t que leera los datos ingresados por el usuario desde el teclado
		Scanner t=new Scanner(System.in);
	
		//Declaramos la variable oct de tipo y lo leeremos utilizando el el metodo nextLine que leera toda la cadena hasta el proximo salto de linea
		//A su vez leeremos el valor desde teclado utilizando el objeto Scanner
		System.out.print("Ingrese un numero octal: ");
		String oct=t.nextLine(); 

		//Imprimimos en pantalla el numero octal
		//Utilizamos la clase Integer para llamar el metodo parseInt para regresar la cadena que contiene a un numero octal
		//Se utiliza el metodo toHexString de la clase Integer para convertir el valor de tipo octal en la variable oct a un valor de tipo hexadecimal
		System.out.print("El numero "+oct+" a hexadecimal es: "+Integer.toHexString((Integer.parseInt(oct, 8))));

}
}