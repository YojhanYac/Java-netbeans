package Clase3;

public class NewClass {
    
    public static void main(String[] args) {
        
        //Inicializando variables
        int suma = 0;
        int num = 1;
        int resta = 0;
        String bloque = "";
        
        //Si la condición es verdadera ingresa al bloque "if", sino al "else"
        if (num >= 3) {
            suma = num + num;
            System.out.println("El resultado de la suma es: " + suma);
            bloque = "PRIMER IF";
        } else {
            //Utilización de if/else anidados
            if (num == 0) {
                System.out.println("El número es 0");
                bloque = "SEGUNDO IF";
            } else {
                resta = num - 5;
                System.out.println("El resultado de la resta es: " + resta);
                bloque = "SEGUNDO ELSE";
            }
        }
        
        System.out.println("El bloque al que entró el programa fue el " + bloque);
    }
}
