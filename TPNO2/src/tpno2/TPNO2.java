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
        
        System.out.print("\nIngresar el limite a imprimir: ");
        Scanner teclado = new Scanner(System.in);
        
        int limite = teclado.nextInt();
        numero = 1;
        
        while (numero <= limite) {
            System.out.println(numero);
            numero++;
        }
        
        System.out.println("\n");
        
        //c.Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en dos. La secuencia debería ser: 200...202...204...etc.
        
        numero = 200;
        
        while (numero <= 250) {
            System.out.println(numero);
            numero = numero + 2;
        }
        
        System.out.print("\n");
        
        //d.Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo. La cuenta debe comenzar en 10 y terminar en 1.
        
        for (int aux = 10; aux >= 0; aux--) {
            System.out.println(aux);
        }
        
        //e.Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra “salir”.
        
        System.out.print("\nIngrese una palabra: ");
        
        String palabra = teclado.next();
        
        while (!palabra.equals("salir")) {
            System.out.println("Palabra ingresada: " + palabra);
            System.out.print("Ingrese una palabra: ");
            palabra = teclado.next();
        }
        
        /*2)Ejercicios integradores
        Resolver los siguientes ejercicios. Intentar ejecutarlos y probarlos con datos de prueba.
        a.Un gerente de una empresa prestadora de servicios de internet necesita un programa que permita  realizar  el  cálculo  del  monto  a  pagar  de  la  factura  de  consumo  de  internet  de  5 clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del cliente y el tipo de servicio. Los tipos de servicio son 3:
        i.Internet 30 megas (cuyo valor es de $890–10% de descuento)
        ii.Internet 50 megas (Cuyo valor es de $1050–5% de descuento) 
        iii.Internet 100 megas (Cuyo valor fijo es de $1600)
        El programa debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente) e informar por pantalla el DNI del mismo junto con el monto a pagar y el número de servicio con el que cuenta.*/
        
        System.out.println("\nCálculadora InterPlus");
        System.out.print("Ingrese el DNI del cliente: ");
        long dni = teclado.nextLong();
        System.out.print("Tipos de servicios:\t1-Internet 30 megas\t2-Internet 50 megas\t3-Internet 50 megas\nIngrese el tipo de servicio contratado: ");
        int servicio = teclado.nextInt();
        
        //valores fijos
        int servicio1 = 890;
        int servicio2 = 1050;
        int servicio3 = 1600;
        
        switch (servicio) {
            case 1: 
                System.out.println("El monto a pagar para el cliente con DNI " + dni + " es: $" + (servicio1 - (servicio1 * 0.1)));
                break;
            case 2:
                System.out.println("El monto a pagar para el cliente con DNI " + dni + " es: $" + (servicio2 - (servicio1 * 0.05)));
                break;
            case 3:
                System.out.println("El monto a pagar para el cliente con DNI " + dni + " es: $" + servicio3);
                break;
            default:
                System.out.println("Ingrese un valor validado");
                break;
        }
        
        /*b.Un niño de primaria necesita realizar 10 cálculos diferentes entre dos números. Para esto necesita un programa que, para cada cálculo, permita el ingreso de los dos números por separado al igual que la operación que desea hacer entre ambos. Al mismo tiempo debe poder realizar el cálculo en cuestión y mostrar el resultado por pantalla.
        Por ejemplo:    Número 1 = 25   Número 2= 15    Operador = +    */
        
        System.out.print("\nCalculadora escolar\nIngrese el valor del primer número: ");
        int numero1 = teclado.nextInt();
        System.out.print("Ingrese el valor del segundo número: ");
        int numero2 = teclado.nextInt();
        System.out.print("Ingrese el operador a utilizar entre los dos números: ");
        String operador = teclado.next();
        
        switch (operador) {
            case "+":
                System.out.println("El resultado es: " + (numero1 + numero2));
                break;
            case "-":
                System.out.println("El resultado es: " + (numero1 - numero2));
                break;
            case "*":
                System.out.println("El resultado es: " + (numero1 * numero2));
                break;
            case "/":
                System.out.println("El resultado es: " + (numero1 / numero2));
                break;
            default:
                break;
        }
        
        /*c.En  la  ciudad  de  Oberá,  Misiones  se  realiza  año  a  año  la “Maratón  del  Inmigrante” en  el marco de la Fiesta Nacional del Inmigrante. El evento cuenta con un día de inscripciones el día anterior a la carrera, por lo que se desconoce la cantidad exacta de inscriptos que puede llegar  a haber.  Desde  la  Federación  de  Colectividades  (Organismo  que  organiza), manifestaron que se solicitan los siguientes datos para la inscripción de cada participante: dni, nombre, apellido y edad.
        En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:
        •Menores A (de 6 a 10años)
        •Menores B (de 11 a 17 años)
        •Juveniles(de 18 a 30 años)
        •Adultos (de 31 a50 años)
        •Adultos mayores (mayores de 50 años)
        Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se muestre por pantalla a qué categoría debe ser inscripto. Cabe destacar que, al finalizar el día, para dar fin a las inscripciones,se debe ingresar un dni con el valor 0 y un nombre con la palabra “fin”.
        */
        
        System.out.println("\nInscripción a Maratón del Inmigrante");

        long dniParticipante = 1;
        String nombreParticipante = "";
        String apellidoParticipante = "";
        int edadParticipante = 0;
        
        while (dniParticipante != 0 && !nombreParticipante.equals("fin")) {
            
            System.out.print("Ingrese el DNI del participante: ");
            dniParticipante = teclado.nextLong();
            System.out.print("Ingrese el nombre del participante: ");
            nombreParticipante = teclado.next();
            
            if (dniParticipante != 0 && !nombreParticipante.equals("fin")) {
                
                System.out.print("Ingrese el apellido del participante: ");
                apellidoParticipante = teclado.next();
                System.out.print("Ingrese la edad del participante: ");
                edadParticipante = teclado.nextInt();
                
                if (edadParticipante >= 6) {
                    if (edadParticipante <= 10) {
                    System.out.println("La categoria en la que debe ser inscripto es: Menores A");
                    } else if (edadParticipante <= 17) {
                    System.out.println("La categoria en la que debe ser inscripto es: Menores B");
                    } else if (edadParticipante <= 30) {
                    System.out.println("La categoria en la que debe ser inscripto es: Juveniles");
                    } else if (edadParticipante <= 50) {
                    System.out.println("La categoria en la que debe ser inscripto es: Adultos");
                    } else {
                        System.out.println("La categoria en la que debe ser inscripto es: Adultos mayores");
                    }
                } else {
                    if (dniParticipante != 0) {
                        System.out.println("La edad miníma es 6 años, no se puede inscribir");
                    }
                }
            } else {
                System.out.println("Finalizó las inscripciones del día!\n");
            }
        } 
    }
}
