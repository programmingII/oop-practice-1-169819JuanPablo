/**
*Nombre: Juan Pablo Martinez
*Fecha: 24/02/2019
*Hora: 4:33 PM
*/

//Llamamos a la clase Scanner del paquete java.util utilizando import
//Esta clase permite una lectura de datos mucho mas facil
import java.util.Scanner;

//Creamos la clase principal
class Ejercicio33{
	public static void main(String args[]){
		//Creamos un objeto del tipo Scanner llamado t que leera los datos ingresados por el usuario desde el teclado
		Scanner t=new Scanner(System.in);
		//Inicializamos la variable res en 0 para guardar la suma de los digitos del numero ingresado
		int res=0, num;
		//Ingresamos el numero
		System.out.print("Ingrese un numero: ");
		num=t.nextInt();
		//Utilizamos el bucle while, para realizar las siguientes operaciones
		
		while(num>0){
		//La funcion del ciclo while es que mientras el valor de la variable num sea mayor a 0 seguira realizando las operaciones
		//La variable res almacena la suma total del valor obtenido al sacar el resididuo del numero ingresado entre 10
		//El operador += sumara el valor anterior de la variable res mas el valor actual obtenido
		res+=num%10;
		//Se divide entre 10 el valor de num para repetir el ciclo y dividir todos los digitos de la variable hasta llegar a 0
		num=num/10;
}
		//Se imprime el valor del resultado
		System.out.print("El valor de la suma de los digitos es: "+res);
}
}