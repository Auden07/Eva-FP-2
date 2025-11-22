/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_breack;

/**
 *
 * @author WinUser
 */
public class EVA2_27_BREACK {

   
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
        int valor, adivinar;
        do{
            adivinar = (int)(Math.random() * 5);
            System.out.println("Adibinar el numero. -1 para terminar.");
            valor = captu.nextInt();
            if(valor == adivinar)
                System.out.println("ADIVINASTE!!!");
            else if(valor == -1){
                System.out.println("gracias por jugar!!");
                break;//Termina la ejecucion del ciclo
            }else{
                System.out.println("NO ADIVINASTE!!");
        }while(true);//CONDICION PARA REPARTIR (true)
    
    

    }
    

