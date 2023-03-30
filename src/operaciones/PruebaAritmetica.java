/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import static java.time.temporal.TemporalAdjusters.next;
import java.util.Scanner;

public class PruebaAritmetica {

    public static void main(String[] args) {
        try {
            Aritmetica aritmetica1 = new Aritmetica();
            Scanner consola = new Scanner(System.in);
            System.out.println("Ingrese un valor para a: ");
            int numero1 = Integer.parseInt(consola.nextLine());
            System.out.println("Ingrese un valor para b: ");
            int numero2 = Integer.parseInt(consola.nextLine());
            aritmetica1.sumar(numero1, numero2);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }

}
