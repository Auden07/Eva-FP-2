/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_15_areas;

import java.util.Scanner;

/**
 *
 * @author WinUser
 */
public class EVA3_15_AREAS {
    
    public static double calcularArea(double radio){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public static double calcularArea(double base, double altura){
        return base * altura;
    }
    
    public static double calcularArea(double baseMayor, double baseMenor, double altura){
        return((baseMayor + baseMenor) / 2) * altura;
    }
    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("***CALCULO DE AREAS***");
            System.out.println("1. circulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Trapecio");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion:");
            opcion = captu.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el radio del circulo:");
                    double radio = captu.nextDouble();
                    if (radio  <= 3){
                    System.out.println("Area del circulo = " + calcularArea(radio));
                    }else {
                        
                    }
                    break;
                    
                case 2:
                    System.out.println("Ingrese la base del rectangulo:");
                  double base = captu.nextDouble();
                  System.out.println("Ingrese la altura del rectangulo:");
                  double altura = captu.nextDouble();
                  System.out.println("El area del rectangulo es:" + calcularArea(base,altura));
                  break;
                  
                case 3:
                    System.out.println("Ingrese la base mayor del trapecio:");
                  double baseMayor = captu.nextDouble();
                  System.out.println("Ingrese la base menor del trapecio:");
                  double baseMenor = captu.nextDouble();
                  System.out.println("Ingrese la altura del trapecio");
                  double alturaTrap = captu.nextDouble();
                  System.out.println("El area del trapecio es: " + calcularArea(baseMayor, baseMenor, alturaTrap));
                  break;
                  
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
            
       } while (opcion !=4);
        captu.close();
    }
    
}


