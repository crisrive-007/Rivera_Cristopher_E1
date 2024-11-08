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
public class Caja_Digital {
    
    public static void caja_digital(){
        Scanner entrada = new Scanner(System.in);
        int HD = 0, normales = 0, costo = 0;
        double subtotal, impuesto = 0.15, total;
        String nombre, respuesta, canal, caja;
        
        System.out.print("Ingrese su nombre: "); //se solicita el nombre del cliente.
        nombre = entrada.nextLine();
        
        do{ //este ciclo do agrega los canales.
            System.out.print("Ingrese el tipo de canal (HD o Normal): ");
            canal = entrada.nextLine();
            
            if(canal.equals("HD")){ //se cuentan los canales HD y los normales.
                HD++;
            } else if (canal.equals("Normal")){
                normales++;
            }
            
            System.out.print("Desea agregar otro canal? "); //se pregunta si se desea agregar mas canales.
            respuesta = entrada.nextLine().toUpperCase();
        } while (respuesta.equals("SI"));
        
        System.out.print("Ingrese el tipo de caja digital (LIGHTBOX, HDBOX, DVRBOX): "); //se solicita el tipo de caja digital.
        caja = entrada.nextLine();
        
        if (caja.equals("LIGHTBOX")){ //se asignan lso costos dependiendo del tipo de caja.
            costo = 50;
        } else if (caja.equals("HDBOX")){
            costo = 100;
        } else if (caja.equals("DVRBOX")){
            costo = 150;
        }
        
        subtotal = (HD * 20) + (normales * 30) + costo; //se calcula el subtotal de los canales ingresados
        total = subtotal + (subtotal * impuesto); //se agregan los impuestos.
        
        System.out.println("-------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Canales normales: " + normales);
        System.out.println("Canales HD: " + HD);
        System.out.println("Subtotal: " + subtotal + " Lps.");
        System.out.println("Impuesto: " + (subtotal * impuesto) + " Lps.");
        System.out.println("Total: " + total + " Lps.");
    }
}
