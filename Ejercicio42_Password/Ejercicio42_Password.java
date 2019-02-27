/**
*Nombre: Juan Pablo Martinez
*Fecha: 25/02/2019
*Hora: 10:25 PM
*/

import java.io.Console;
class Ejercicio42{

    public void Password() {        
        Console console = System.console();
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }

        console.printf("Testing password%n");
        char passwordArray[] = console.readPassword("Enter your secret password: ");
        console.printf("Password entered was: %s%n", new String(passwordArray));

    }

    public static void main(String[] args) {
        new Ejercicio42().Password();
    }
}