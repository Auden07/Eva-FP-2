/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_adivinar_while;

import java.util.Scanner;

/**
 *
 * @author WinUser
 */
public class EVA2_26_ADIVINAR_WHILE { 
    
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
        int valor = 0, adivinar;
        while(valor != -1){
            adivinar = (int)(Math.random() * 5);
            System.out.println("Adibinar el numero. -1 para terminar.");
            valor = captu.nextInt();
            if(valor == adivinar)
                System.out.println("ADIVINASTE!!!");
        }
    }
    
}
    
    
