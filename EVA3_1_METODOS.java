/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author WinUser
 */
public class EVA3_1_METODOS {

    
    public static void main(String[] args) {
    //INVOCAR EL METODO
    // LLAMADA A PROCEDIMIENTO O FUNCION
    // 1. Si queremos recuperar el valor 
    int resu = calcularCuadrado(4);
    System.out.println("El cuadrado de 4 es" + resu ); 
    //2. usar el valor sin guardarlo
    System.out.println("El cuadrado de 4 es" + calcularCuadrado(4));
    //3. no me interesa el resultado
    calcularCuadrado(4);
    }
    //MODIFICADORES 
    //MODIFICADORE DE ACCESO: public, private, protected, default
    //static-- se necesita para usar nuesros metodos en el main
    //public static
                   //VALOR DE RETORNO (tipo de dato)
                      //NOMBRE DEL METODO (USAR VERBO)
                                   //(LISTA DE PARAMETROS)
                                    //CERO O N CANTIDAD
    public static int calcularCuadros(int num){ //ENCABEZADO (
        //{} -- IMPLEMENACION DEL METODO ( CUERPO DEL METODO)
        int cuadrado = num* num;
        return cuadrado; // regresamos el resultado
        //ya  no se puede poner codigo aqui
        //System.out.println(""); //error,  mo se puede poner codigo
}
    
}