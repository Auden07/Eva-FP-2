/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_.pkg3_switch;

/**
 *
 * @author WinUser
 */
public class EVA2_3_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor = "Lunes";
        switch (valor){
              case "Lunes":
                System.out.println(1);
                break;
              case "Martes":
                System.out.println(2);
                break;
              case "Miercoles":
                System.out.println(3);
                break;
              default:
                  System.out.println("Valor incorrecto");
    }

    }
}