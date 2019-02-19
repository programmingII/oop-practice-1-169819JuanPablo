/**
*Nombre: Juan Pablo Martinez 
*Fecha: 18/02/2019
*Hora: 10:12 PM
*/

//Llamamos a la clase Scanner del paquete java.util utilizando import
//Esta clase permite una lectura de datos mucho mas facil
import java.util.Scanner;

//Creamos la clase principal
class Ejercicio29{
	//Creamos la clase principal llamada main
	//Usamos el modificador de acceso public para que cualquier clase pueda acceder a la informacion de la misma clase
	//static indica que no se utilizara una instancia de clase para el acceso del metodo
	//el tipo de objeto sera void, el cual no regresara ningun valor
	//String args es el parametro del metodo principal, el cual contiene un array que contendra valors de tipo string
	//Tambien el parametro string args permite una lectura mas facil desde la consola de comandos
	public static void main(String args[]){
		//Creamos un objeto del tipo Scanner llamado t que leera los datos ingresados por el usuario desde el teclado
		Scanner t=new Scanner(System.in);
	
		//Declaramos la variable hex de tipo y lo leeremos utilizando el el metodo nextLine que leera toda la cadena hasta el proximo salto de linea
		//A su vez leeremos el valor desde teclado utilizando el objeto Scanner
		System.out.print("Ingrese un numero hexadecimal: ");
		String hex=t.nextLine(); 

		//Imprimimos en pantalla el numero hexadecimal
		//Utilizamos la clase Integer para llamar el metodo parseInt para regresar la cadena que contiene a un valor de tipo entero en base 16
		//Usaremos la clase Integer y llamamos al metodo toBinaryString para devolver el valor hexadecimal guardado en la variable hex a un valor de tipo binario
		System.out.print("El numero "+hex+" a binario es: "+Integer.toBinaryString((Integer.parseInt(hex, 16))));

}
}