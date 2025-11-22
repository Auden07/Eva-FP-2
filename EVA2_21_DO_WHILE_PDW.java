/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_do_while_pdw;

import java.util.Scanner;

/**
 *
 * @author Auden
 */
public class EVA2_21_DO_WHILE_PDW {
final static String USUARIO = "admin";
final static String PWD = "admin";    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        String usuario, contra;
        do{
            System.out.println("-----ACCESO AL SISTEMA-----");
            System.out.println("USUARIO: ");
            usuario = captu.nextLine();
            System.out.println("CONTRASEÑA: ");
            contra = captu.nextLine();
        }while(!(usuario.equals(USUARIO)&& contra.equals(PWD)));
        System.out.println("BIENVENIDO AL SISTEMA!!");
    }
    
}
