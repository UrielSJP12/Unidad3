
package com.mycompany.cajerovirtual;
import java.util.Scanner;

public class CajeroVirtual {

    public static void main(String[] args) {
       
Scanner dinero = new Scanner(System.in);
double saldo = 1000.0;


     System.out.println("Bienvenido al Cajero Automático");
     System.out.println("1. Consultar Saldo");
     System.out.println("2. Depositar Dinero");
     System.out.println("3. Retirar Dinero");
     System.out.println("4. salir");
     
     int opcion = dinero.nextInt();
     
     switch(opcion){
         case 1:
         System.out.println("Saldo actual: $" + saldo);
         break;
         case 2:
         System.out.println("Ingresa la cantidad a despositar: $");
         double deposito = dinero.nextDouble();
         saldo += deposito;
         
         System.out.println("Deposito existoso.Saldo actual: $" + saldo);
         break;
         case 3:
         System.out.println("Ingrese la cantidad a retirar: $");
         double retiro = dinero.nextDouble();
         
         if (retiro <= saldo){
             saldo -= retiro;
             
             System.out.println("Retiro exitoso.saldo actual: $" + saldo);
  
         }else{
             System.out.println("saldo insuficiente");
         }break;
         case 4: 
             System.out.println("Gracias por ulilizar el cajero automatico");
             System.exit(0);
             break;
             
         default:
             System.out.println("opcion no validad.Intente de nuevo");
             break;
     }
             
}
	
        
    }

