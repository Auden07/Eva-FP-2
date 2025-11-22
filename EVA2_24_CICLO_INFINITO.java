/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ciclo_infinito;

import java.util.Scanner;

/**
 *
 * @author Auden
 */
public class EVA2_24_CICLO_INFINITO {

final static String USUARIO = "admin";
final static String PWD = "admin";
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        String usuario, contra;
        while(true){
            System.out.println("-----ACCESO AL SISTEMA-----");
            System.out.println("USUARIO: ");
            usuario = captu.nextLine();
            System.out.println("CONTRASEÑA: ");
            contra = captu.nextLine();
            if(usuario.equals(USUARIO)&& contra.equals(PWD))
               break;//Termina el ciclo
        }
        System.out.println("BIENVENIDO AL SISTEMA!!");
    }
    
}
