package holamundo;

public class HolaMundo {

    public static void main(String[] args) {

        //Comentario que no será interpretado por el compilador
        System.out.println("\nHola Mundo! :)");
        System.out.print("Bienvenido al curso de Java");
        System.out.println(", utilizando NetBeans");
        
        //Tipos de variables: int, double, Boolean, char, String, long
        //Declarando variables e iniciandolas
        int numero = 12;
        double precio = 21.3;
        Boolean inicio = true;
        char letra = 'a';
        String mensaje = "\"Cadena de texto por varible\"";
        long cantEstrellas = 947291363;
        
        //Imprimiendo los valores guardados
        System.out.println("\nVariables guardadas = " + numero + " " + precio + " " + inicio + " " + letra + " " + mensaje + " " + cantEstrellas + "\n");

    }
    
}
