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
        
        int signo = 1;
        double fraccion;
        double numerador = 1.00;
        int denominador = 1;
        int contador = 1;
        int limite = 8;
        double suma = 0; 
        
        while (contador <= limite) { 
            fraccion = numerador/denominador;
            
            suma = suma + (signo*fraccion);
                        
            signo = signo * -1;
            
            denominador = denominador + 2;
            
            
            contador = contador + 1;
            
            
        }
        
        System.out.printf("%.2f",suma);
    }
    
}
