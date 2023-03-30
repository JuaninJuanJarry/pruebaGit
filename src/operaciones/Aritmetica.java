/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

public class Aritmetica {
    //Atributos de la clase

    int number1;
    int number2;

    //metodo
    public void sumar(int a,int b) {
        try {
            System.out.println("resultado = " + (number1 + number2));
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }
}
