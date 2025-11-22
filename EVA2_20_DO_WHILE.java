/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_do_while;

import java.util.Scanner;

/**
 *
 * @author Auden
 */
public class EVA2_20_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("<-----Menu Principal----->");
            System.out.println("Escribe la opcion: ");
            System.out.println("1. Pedidos \n2. Proveedores\n3. Facturacion\n4. Salir");
            opcion = Integer.parseInt(captu.nextLine().trim());
            
            switch(opcion){
                case 1:
                    System.out.println("Pedidos del sistem!!");
                    break;
                case 2:
                    System.out.println("Proveedores del sistema");
                    break;
                case 3:
                    System.out.println("Facturacion del sistema");
                    break;
                    
            }
        }while(opcion != 4);
        System.out.println("Finalizado programa");
                
        
    }
    
}
