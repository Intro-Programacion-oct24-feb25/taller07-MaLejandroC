/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author Alejandro
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int signo = +1;
        double fraccion;
        int numerador = 1;
        double denominador = 1;
        int contador = 1;
        int limite = 8;
        double suma = 0; 
        String cadena = "";
        
        while (contador <= limite) { 
            
            fraccion = numerador/denominador;
                        
            suma = suma + (signo*fraccion);
                        
            if (contador == 1) { 
                cadena = String.format("%d", numerador);
            } else if (signo == 1) {
                cadena = String.format("%s + %d/%.0f", cadena, numerador, denominador);
            } else {
                cadena = String.format("%s - %d/%.0f", cadena, numerador, denominador);
            }
            
            signo = signo * -1;
            
            denominador = denominador + 2;

            contador = contador + 1;
            
            
        }
        System.out.printf("Serie:%s%n", cadena);
        System.out.printf("Resultado: %.2f%n", suma);
    }
    
}
