/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rivera_cristopher_e1;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Rivera_Cristopher_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner eleccion = new Scanner(System.in);
        int opcion;
        System.out.println("===== MENU DE EJERCICIOS =====");//Se muestra el menu de opciones.
        System.out.println("1. Piramide de numeros.");
        System.out.println("2. Numero mayor.");
        System.out.println("3. Caja digital");
        System.out.println("4. Contador de vocales");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = eleccion.nextInt();
        System.out.println("-------------------------");
        
        switch (opcion) {//Determina la opcion que se selecciono.
            
            case 1:
                Piramide.piramide();
                break;
            
            case 2:
                El_Mayor.el_mayor();
                break;
                
            case 3:
                Caja_Digital.caja_digital();
                break;
                
            case 4:
                Caracteres_Vocales.caracteres_vocales();
                break;
                
            case 5:
                System.out.println("HASTA LUEGO!");
                break;
    }
    
}
}