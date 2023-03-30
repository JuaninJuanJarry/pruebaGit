/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

public class Aritmetica {
    //Atributos de la clase

    int a;
    int b;

    //metodo
    public void sumar(int a,int b) {
        try {
            System.out.println("resultado = " + (a+b));
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }
}
