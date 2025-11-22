/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_pirámide;

import java.util.Scanner;

/**
 *
 * @author Auden
 */
public class EVA2_31_PIRÁMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int valor; 
        System.out.println("INTRODUCE DE QUE TAMAÑO QUIERES EL PIRÁMIDE: ");
        valor = captu.nextInt();
        for (int i = 1; i <= valor; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = valor; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
