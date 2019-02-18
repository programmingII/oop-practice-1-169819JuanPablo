/**
*Nombre: Juan Pablo Martinez 
*Fecha: 17/02/2019
*Hora: 4:55 PM
*/

//Llamamos a la clase Scanner del paquete java.util utilizando import
//Esta clase permite una lectura de datos mucho mas facil
import java.util.Scanner;

//Creamos la clase principal
class Ejercicio18{
	//Creamos la clase principal llamada main
	//Usamos el modificador de acceso public para que cualquier clase pueda acceder a la informacion de la misma clase
	//static indica que no se utilizara una instancia de clase para el acceso del metodo
	//el tipo de objeto sera void, el cual no regresara ningun valor
	//String args es el parametro del metodo principal, el cual contiene un array que contendra valors de tipo string
	//Tambien el parametro string args permite una lectura mas facil desde la consola de comandos
	public static void main(String args[]){
		//Declararemos la variable mul de tipo int en donde se guardara la multiplicacion de los numeros binarios
		int mul;
		//Creamos un objeto del tipo Scanner llamado t que leera los datos ingresados por el usuario desde el teclado
		Scanner t=new Scanner(System.in);

		//Declaramos y leemos el valor de tipo String utilizando nextLine, que es un metodo que nos permite leer hasta el salto de linea
		System.out.print("Ingrese el primer numero binario: ");
		String b1=t.nextLine();
		System.out.print("Ingrese el segundo numero binario: ");
		String b2=t.nextLine();

		//Guardamos los valores en dos nuevas variables de tipo int
		//Utilizamos la funcion parseInt para convertir las dos cadenas que ingresamos anteriormente en un valor int con base dos, ya que estamos usando binarios
		int num1= Integer.parseInt(b1, 2);
   		int num2= Integer.parseInt(b2, 2);
		
		//Realizamos la multiplicacion de los binarios y la guardamos en la variable mul
		mul= num1*num2;
		//Utiliamos el metodo toBinaryString para convertir el valor dentro de mul en uno binario y lo imprimimos en pantalla
		System.out.println("La multiplicacion de los binarios "+b1+"*"+b2+" es: "+Integer.toBinaryString(mul));

}

}