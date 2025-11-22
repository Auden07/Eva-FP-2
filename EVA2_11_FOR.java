/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_for;

import java.util.Scanner;

/**
 *
 * @author Auden
 */
public class EVA2_11_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int rep, ini, fin;
        String mensaje;
        System.out.println("Mensaje a repetir:");
        mensaje = captu.nextLine();
        System.out.println("Cantidad de repeticiones:");
        rep = captu.nextInt();
        for(int i = 1; i <= rep; i++){
            System.out.println(mensaje);
        }
        //SOLICITA DOS NÚMEROS AL USUARIO, IMPRIMIR LA LISTA
        //ENTRE ESOS NÚMEROS
        //-3 Y 3 --> -3 -2 -1 O 1 2 3
        //EN OLRDEN INVERSO
        System.out.println("");
        System.out.println("Inicio: ");
        ini = captu.nextInt();
        System.out.println("Fin:");
        fin = captu.nextInt();
        for(int i = ini; i <= fin; i++){
            System.out.println(i + " - ");
        }
        System.out.println("");
        for(int i = fin; i >= ini; i--){
            System.out.println(i + " - ");
        
        }
            
        
    }
    
}
