
package practica3fibonacci;

import java.util.Scanner;
public class Practica3Fibonacci {

    
    public static void main(String[] args)
    {
        int cero = 0, uno = 1, suma;
        System.out.println("serie Fibo");
        
        Scanner Datos = new Scanner(System.in);
        System.out.println("ingrese la cantidad que quiere ver ");
        int numero = Datos.nextInt();
        Datos.close();
        
        System.out.println("La serie fibonacci: " + numero);
        for (int i = 1; i<numero; i++){
            System.out.println(".-" + cero);
            
            suma = cero + uno;
            cero = uno;
            uno = suma;
        }
    }
    
}
