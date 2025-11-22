/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;

import java.util.Scanner;

/**
 *
 * @author Auden
 */
public class EVA2_5_ARREGLOS_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a, b, c;//SON 3 ARREGLOS
        int x[], y, z;//SOLO LA X ES UN ARREGLO
        String cadenas[] = new String[7];
        cadenas[0] = "Lunes";
        cadenas[1] = "Martes";
        cadenas[2] = "Miercoles";
        cadenas[3] = "Jueves";
        cadenas[4] = "Viernes";
        cadenas[5] = "Sabado";
        cadenas[6] = "Domingo";
        Scanner captu = new Scanner(System.in);
        int dia;
        System.out.println("Dia de la semana de (0 a 6):");
        dia = captu.nextInt();
        System.out.println(cadenas[dia]);
    }
    
}
