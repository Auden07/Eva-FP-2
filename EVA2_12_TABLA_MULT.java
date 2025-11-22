/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_mult;

import java.util.Scanner;

/**
 *
 * @author Auden
 */
public class EVA2_12_TABLA_MULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int valor;
        System.out.println("Tabla de multiplicar:");
        valor = captu.nextInt();
        for(int i = 1; i <=10; i++){
            int mult = valor * i;
            System.out.println(valor + " x " + i + " = " + mult);
        
        }
        
       
    }
    
}
