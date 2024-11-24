/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Alejandro
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 1;
        int aumentador = 3;
        int inicial = 2;
        int limite = 6;
        
        while (contador <= limite){
            System.out.printf("%d\n", inicial);
            inicial = inicial + aumentador;
            aumentador = aumentador + 2;
            contador = contador +1;
        }
        
        
    }
    
}
