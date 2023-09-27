/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 
 
 */
public class SaberNumEntero {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner num = new Scanner(System.in);

int numero= 0;

System.out.println("Indique un nÃºmero: ");

numero = num.nextInt();

if ((numero % 2) == 0){

System.out.println(numero + " es par ");

}else{

System.out.println(numero+ " es impar ");
    }
    
}
}