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
public class El_Mayor {
    
    public static void el_mayor(){
        Scanner entrada = new Scanner(System.in);
        int numero, mayor = 0, suma = 0, cantidad = 0;
        double promedio;
        String datos;

        while (true) { //este ciclo while pide un numero entero hasta que el usuario escribe 'No'.
            System.out.print("Ingrese un numero entero (si desea terminar la operacion ingrese 'No'): ");
            datos = entrada.nextLine();

            if (datos.equals("No")) {
                break;
            }

            numero = Integer.parseInt(datos); //aqui se convierte la entrada de datos en un numero entero.
            suma += numero;
            cantidad++;

            if (numero > mayor) { //si el numero ingresado es mayor se actualiza el numero mayor.
                mayor = numero;
            }
        }

        if (cantidad > 0) {
            promedio = (double) suma / cantidad; //se calcula el promedio de los numeros ingresados.
            System.out.println("El numero mayor es: " + mayor);
            System.out.println("El promedio de los numeros es: " + promedio);
        } else {
            System.out.println("Error al ingresar los datos.");
        }

    }
}
