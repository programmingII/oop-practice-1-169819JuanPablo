
import java.nio.charset.Charset;

class Ejercicio40{
	 public static void main(String[] args) {
		System.out.println("List of available character sets: ");  
    		for (String str : Charset.availableCharsets().keySet()) {
      		System.out.println(str);
    		}
  	}

}