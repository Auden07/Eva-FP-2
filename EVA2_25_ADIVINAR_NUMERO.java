/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_adivinar_numero;

import java.util.Scanner;

/**
 *
 * @author WinUser
 */
public class EVA2_25_ADIVINAR_NUMERO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor, adivinar;
        do{
            adivinar = (int)(Math.random() * 5);
            System.out.println("Adibinar el numero. -1 para terminar.");
            valor = captu.nextInt();
            if(valor == adivinar)
                System.out.println("ADIVINASTE!!!");
        }while(valor == -1);//CONDICION PARA REPARTIR (true)
    }
    
}
