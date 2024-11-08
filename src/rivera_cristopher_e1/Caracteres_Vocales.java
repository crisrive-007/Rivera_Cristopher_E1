/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rivera_cristopher_e1;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Caracteres_Vocales {
    
    public static void caracteres_vocales(){
        Scanner entrada = new Scanner(System.in);
        String palabra;
        char[] vocales = {'a', 'e', 'i', 'o', 'u'}; //este arreglo contiene las vocales qeu bsucara en la palabra a ingresar.
        int contador = 0;
        char cadena = 0;
        
        System.out.print("Ingrese una palabra: ");
        palabra = entrada.nextLine();
        
        for (int i = 0; i < palabra.length(); i++) { //se revisan todos los caracteres de la palabra ingresada.
            cadena = palabra.charAt(i);
            
            for (int j = 0; j < vocales.length; j++) { //se verifica que el caracter actual sea una vocal.
                if(cadena == vocales[j]){
                    contador++; //si el caracter actual es una vocal se incrementa el valor del contador.
                }
            }
        }
        
        System.out.println("La palabra '" + palabra + "' contiene " + contador + " vocales.");
    }
}
