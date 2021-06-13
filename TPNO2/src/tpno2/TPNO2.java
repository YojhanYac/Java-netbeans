package tpno2;

import java.util.Scanner;

public class TPNO2 {

    public static void main(String[] args) {
        
        /*Guía de Ejercicios Nº 2: Estructuras repetitivas
        1)Ejercicios introductorios
        a.Realizar un programa que muestre en pantalla los números del 1 al 35 (uno abajo del otro). Utilizar para esto alguna estructura repetitiva.*/
        
        int numero = 1;
        
        while (numero <= 35) {
            System.out.println(numero);
            numero++;
        }
        
        //b.Realizar  un programa que  dado  por  teclado  un  límite  numérico por  teclado(por  ejemplo 100) muestre en pantalla todos los números hasta ese límite (empezando por 1).
        
        System.out.print("Ingresar el limite a imprimir: ");
        Scanner teclado = new Scanner(System.in);
        
        int limite = teclado.nextInt();
        numero = 1;
        
        while (numero <= limite) {
            System.out.println(numero);
            numero++;
        }
        
        //c.Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en dos. La secuencia debería ser: 200...202...204...etc.
        
        numero = 200;
        
        while (numero <= 250) {
            System.out.println(numero);
            numero = numero + 2;
        }
        
        //d.Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo. La cuenta debe comenzar en 10 y terminar en 1.
        
        for (int aux = 10; aux >= 0; aux--) {
            System.out.println(aux);
        }
        
        //e.Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra “salir”.
        
        System.out.print("Ingrese una palabra: ");
        
        String palabra = teclado.next();
        
        while (!palabra.equals("salir")) {
            System.out.println("Palabra ingresada: " + palabra);
            System.out.print("Ingrese una palabra: ");
            palabra = teclado.next();
        }
        
    }
    
}
