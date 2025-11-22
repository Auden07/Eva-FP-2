/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_primos;

import java.util.Scanner;

/**
 *
 * @author Auden
 */
public class EVA2_34_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int val, r = 1;
        System.out.println("Escribe un numero: ");
        val = captu.nextInt();
        boolean esPrimo = true; 
        for (int i = 2; i < val; i++) {
            r = val % i;
            if(r == 0 ){//NO ES NUMERO PRIMO
                esPrimo = false;
                break;
            }
        }
        if(esPrimo)
            System.out.println("El vaalo--" + val + "--Es Primo");
        else 
            System.out.println("El valor--" + val + "--No es Primo");
                    
    }
    
}
