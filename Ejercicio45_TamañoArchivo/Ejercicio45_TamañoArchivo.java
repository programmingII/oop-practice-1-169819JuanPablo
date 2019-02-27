/**
*Nombre: Juan Pablo Martinez
*Fecha: 26/02/2019
*Hora: 1:07
*/

//Llamamos el paquete java.io que nos permite la entrada y salida de datos del sistema
//Llamamos la clase File que nos permitira conocer la informacion acerca de los archivos
import java.io.File;

class Ejercicio45{
	public static void main(String args[]){
		//Creamos un objeto llamado f utilizando la clase file
		//A su vez asignamos la ruta en la que se encuentra el archivo que se quiere saber su tamaño
		File f=new File("C:\\Users\\juanp\\Desktop\\EjerciciosJAVA\\Ejemplo.txt");
		//Utilizamos un if para utilizar la condicion f.exists(), en donde exists() es un metodo que nos permite saber si un archivo existe o se encuentra en la ruta especificada
		//En caso contrario nos devolvera un mensaje de que el archivo no existe
		if(f.exists()){
			//Si el archivo se encuentra, declaramos una variable de tipo double llamada bytes
			//Dentro de la variable guardaremos el tamaño del archivo
			//Uilizamos el metodo lenght() que nos devolvera el tamaño del archivo
			double bytes=f.length();
			//Imprimimos el resultado
			System.out.print("El tamaño en bytes del archivo es: "+bytes+" Bytes");
		}else{
			System.out.print("El archivo no existe");
}
}
}