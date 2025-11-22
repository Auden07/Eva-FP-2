/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_factorial;

import java.util.Scanner;

/**
 *
 * @author Auden
 */
public class EVA2_32_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int valor, re = 1; 
        System.out.println("INTRODUCE UN NUMERO: ");
        valor = captu.nextInt();
        for (int i = 1; i <= valor; i++){
            re = re * i;
            
        }
        System.out.println(re);
    }
    
}
