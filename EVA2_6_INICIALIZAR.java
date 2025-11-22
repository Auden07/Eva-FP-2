/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_inicializar;

import java.util.Scanner;

/**
 *
 * @author Auden
 */
public class EVA2_6_INICIALIZAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemana[] = {"Lunaes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        Scanner captu = new Scanner(System.in);
        int dia;
        System.out.println("Dia de la semana de (0 a 6):");
        dia = captu.nextInt();
        System.out.println(diasSemana[dia]);
    }
    
}
