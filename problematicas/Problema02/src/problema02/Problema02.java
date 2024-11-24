/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author Alejandro
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 1;
        int lim = 10;
        int numeroI = 2;
        int resultado;
        
        
        while (contador <= lim) {
            resultado = contador * numeroI;
            System.out.printf("%d\n",resultado);
            contador = contador + 1;
            numeroI = numeroI + 1;
        }
    }
    
}
