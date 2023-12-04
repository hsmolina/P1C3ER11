
package actividad2pooe11;

//Importamos el java.util.Scanner para registrar los datos escritos
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        //Título y datos
        System.out.println("Ejercicio resuelto #11");
        
        //Definimos la variable scanner de tipo Scanner para que registre las entradas
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario digite 3 números enteros
        System.out.print("Ingrese el primer número entero: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada1 = scanner.nextLine();
        int a = Integer.parseInt(entrada1);
        
        System.out.print("Ingrese el segundo número entero: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada2 = scanner.nextLine();
        int b = Integer.parseInt(entrada2);
        
        System.out.print("Ingrese el tercer número entero: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada3 = scanner.nextLine();
        int c = Integer.parseInt(entrada3);
        
        //Toma de decisiones
        if (a > b && b > c) {
            System.out.println("El valor mayor entre " + a + ", " + b + " y " + c + " es: " + a);
        } else if (b > c) {
            System.out.println("El valor mayor entre " + a + ", " + b + " y " + c + " es: " + b);
        }
        else {
            System.out.println("El valor mayor entre " + a + ", " + b + " y " + c + " es: " + c);
        }
        
    }
    
}
