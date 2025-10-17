//Es necesario crear un método (función) llamado calcularAreaCirculo. 
//Parámetros recibidos: int diámetro y devolverá un double con el área. 
//Utilizamos el ejercicio para ver Math.PI y Math.Pow del import java.lang.Math;cómo y 
//cómo limitar la visualización de posiciones decimales: 
//
//double valor = 123.456789;
//
//String.format("%.3f", valor)  
//
//Muestra: 123.456

package metodos_EJERCICIO4;
import java.util.Scanner;
import java.lang.Math;;

public class areaCirculo {

	public static void main(String[] args) {
		
		//se crea el Scanner
		Scanner leer;
		leer = new Scanner(System.in);
		
		//variables
		int diametro;
		
		//mensaje que se muestra por pantalla y se recoge lo que introduce el usuario
		System.out.println("introduce el diametro");
		diametro = leer.nextInt();
		
		//se muestra por pantalla el resultado haciendo una llamada al metodo "calcularAreacirculo"
		System.out.println("el resultado es: " + calcularAreaCirculo(diametro));
		
		leer.close();
	}
	
	public static String calcularAreaCirculo (int diametroX) {
		
		//variables
		double area;
		String areaS="";
		
		//operacion matematica para sacar el area de un circulo
		area = (Math.PI / 4) * Math.pow(diametroX, 2);
		
		//se convierte el valor de "area" a un STRING para redondearlo a 3 decimales
		areaS = String.format("%.3f", area);
		
		//se hace un return de un STRING
		return areaS;
		
	}

}
