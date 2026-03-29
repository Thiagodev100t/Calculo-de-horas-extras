
import java.util.*;
import java.text.DecimalFormat;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pichau
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variaveis
       Scanner teclado = new Scanner(System.in);
        
        double sal = 3091;
        double horasMes= 119;
        
        // entradas horas extra
        System.out.println("quantas horas extras de 50% foi feita? ");
        double horas50 = teclado.nextDouble();
        
        System.out.println("quantas horas extras de 100% foi feita");
        double horas100 = teclado.nextDouble();
        
        //valor por dia
        double horaNormal = sal / horasMes;
  
         // soma das horas extra
        double soma50 = horaNormal * 1.5;
        double soma100 = horaNormal * 2;
        
        //soma das horas extras
        double valor50  = (int) soma50 * horas50;
        double valor100  = (int) soma100 * horas100;
        
        double tothoras = (int) horas50 + horas100;
        
        System.out.printf("valor de horas normais: %.2f%n", horaNormal);
        System.out.printf("valor de horas a receber de 50: %.2f%n",  valor50);
        System.out.printf("valor de horas a receber de 100: %.2f%n", valor100);
        System.out.print("saldo hora extra trabalhado:"+ tothoras);
       
    }
    
}
