/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author WinUser
 */
public class Eva2_15_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int tama;
        System.out.println("Cuantas calificaciones quieres capturar");
        tama = captu.nextInt();
        int califas[] = new int[tama];
        for(int i = 0; i < califas.length; i++){
         System.out.println("Calificacion #" + (i + 1) + ":");
        califas[i] = captu.nextInt();
    }
    }
    
}
