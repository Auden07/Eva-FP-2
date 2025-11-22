/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_metodos;

import java.util.Scanner;

/**
 *
 * @author WinUser
 */
public class EVA3_3_METODOS {
    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        do{
            imprimirMenu();
            valor = captu.nextInt();
            //manejo de opcion -- 
            switch(valor){
                case 1:
                    System.out.println("*****SUMAR DOS NUMEROS*****");
                    realizarSuma();
                    break;
                case 2:
                    System.out.println("*****CALCULAR POTENCIA*****");
                    realizarPotencia();
                    break;
                case 3:
                    break;
                            
            }
        }while(valor != 4);
        
    }

    private static int sumar(int val1, int val2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //IMPRIMIR UN MENU:
    public static void imprimirMenu{
    System.out.println("BIENVENIDO AL SISTEMA");
    System.out.println("Eligue la opcion que necesitas");
    System.out.println("1. Calcular una suma");
    System.out.println("2. calcular una potencia");
    System.out.println("3. imprimir un mensaje");
    System.out.println("4. terminar");
}
public static void realizarSuma(){
    Scanner captu = new Scanner(System.in);
    int val1, val2;
    System.out.println("Valor 1:");
    val1 = captu.nextInt();
    System.out.println("Valor 2:");
    val2 = captu.nextInt();
    int resu = sumar(val1, val2);
    System.out.println("La suma es" + resu);
}
public static int suamr(int num1, int num2){
    return num1 + num2;
}
public static void realizarPotencia(){
    Scanner captu = new Scanner(System.in);
    int val1, val2;
    System.out.println("Base:");
    val1 = captu.nextInt();
    System.out.println("Exponente:");
    val2 = captu.nextInt();
    int

   }
}


    