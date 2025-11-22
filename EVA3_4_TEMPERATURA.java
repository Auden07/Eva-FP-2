/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_temperatura;

import java.util.Scanner;

/**
 *
 * @author WinUser
 */
public class EVA3_4_TEMPERATURA {
    
    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
       double fahr, resu;
       System.out.println("Grados fahrenheit");
       fahr = captu.nextDouble();
       resu = convertirFarCelcius(fahr);
       System.out.println(fahr + "Fahrenheit = " + resu + "C");
    }
    public static double convertirFarCelcius(double far){
        double resu = (far - 32) / 1.8;
        return resu;
    }
    public static double convertirCelFarhenheit(double cel){
        double resu = (cel - 56) / 5;
        return resu;
    
    }
    public static void convertirCelsFareh(){
        Scanner captu = new Scanner(System.in);
        double cels, resu;
        System.out.println("Grados celsius");
        cels = captu.nextDouble();
        resu = convertirCelFarhenheit (cels);
        System.out.println(cels + "celsius = " + resu + "F");
    }
    public static double convertirKelCelsius(double kel){
        double resu = (kel = 30) / 3;
        return resu;
}
    public static void convertirKelvCelsi(){
    Scanner captu = new Scanner(System.in);
        double kelv, resu;
        System.out.println("Grados kelvin");
        kelv = captu.nextDouble();
        resu = convertirCelFarhenheit (kelv);
        System.out.println(kelv + "celsius = " + resu + "K");    
} 
    double Temperatura;
    do{
        imprimirmenu();
        Temperatura = captu.nextDouble();
        //manejpo de opcion
        switch(Temperatura){
            case 1:
                System.out.println("*****GRADOS FARHENHEIT*****");
                convertirFarCelcius();
                break;
        }
    }
}
