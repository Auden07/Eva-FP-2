/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_cuenta;

import java.util.Scanner;

/**
 *
 * @author Auden
 */
public class EVA2_33_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int cre = 1000000, re;
        
        do{
            System.out.println("CANTIDAD A RETIRAR: ");
            re = captu.nextInt();
            cre = cre-re;
            System.out.println(cre);
        }while(cre > 0);
    }
    
}
