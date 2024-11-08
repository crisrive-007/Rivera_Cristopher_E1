/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rivera_cristopher_e1;

/**
 *
 * @author river
 */
public class Piramide {
    
    public static void piramide(){
        int filas = 6, impar = 1, suma = 0; //'filas' es el numero de filas que se van a imprimir y 'impar' sera el primer valor que se va a imprimir.
        
        for (int i = 1; i <= filas; i++) { //este ciclo for sirve para repetir el proceso en el numero de filas que hay.
            for (int j = 1; j <= i; j++) { //este ciclo imprime los numeros en cada fila.
                System.out.print(impar + " ");
                suma += impar;
                impar += 2;
            }
            
            System.out.println("= " + suma); //en cada fila se imprime la suma de los numeros.
        }
    }
}