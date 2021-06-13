package tpno1;

public class TPNO1 {

    public static void main(String[] args) {
        
        //*************Ejercicio Nº1: Tipos de datos, Variables y Operaciones*************
        
        //1)Probar realizar las operaciones que se citan a continuación en el IDE Netbeans, registrar los errores obtenidos y responder a las preguntas citadas.
        
        //a.Declarar una variable de tipo entero, otra de tipo double y otra de tipo String
        int variableInt;
        double variableDouble;
        String variableString;
        
        //b.Asignar un valor a la variable de tipo entero y asignar esta última a la variable de tipo double. ¿Existe un error ? ¿Se puede hacer esta operación ?
        variableInt = 12;
        variableDouble = variableInt; //No hay error, se puede hacer la operación ya que Double es más grande y contine a los enteros
        
        //c.Asignar  un valor a la variable de tipo double y asignar esta última a la variable de tipo entero. ¿Existe un error? ¿Se puede hacer esta operación ?
        variableDouble = 952942384;
        //variableInt = variableDouble; //Existe error, se desborda ya que int no tiene suficiente memoria para guardar un valor double
        
        //d.Asignar  el valor 35 a la variable de tipo String. ¿Existe un error ? ¿Se puede hacer esta operación ?
        //variableString = 35; //Existe error, no se puede guardar un valor entero dentro de una variable del tipo String ya que espera una cadena de caracteres
        
        //e.Si  quiero  almacenar el  número  48  en la  variable String. ¿Cómo debo  realizar la asignación ?
        //Para realizarlo se puede guardar como cadera de caracteres, si se necesita el valor del tipo entero se puede castear
        variableString = "35";
        
        
        //2)Realizar un programa que permita el intercambio de valores entre dos variables. Por ejemplo: Si  una  variable  numero vale  35,  y  una  variable  numero2  vale  20,  realizar  las  acciones necesarias para que numero pase a valer 20 y numero2 pase a valer 35. Una vez realizado el cambio mostrar el resultado por pantalla
        
        int numero = 35;
        int numero2 = 20;
        int aux = 0;
        
        System.out.println("Inician:\tnumero = " + numero + "\tnumero2 = " + numero2);
        
        aux = numero;
        numero = numero2;
        numero2 = aux;
        
        System.out.println("Finalizan:\tnumero = " + numero + "\tnumero2 = " + numero2);
        
        
        //*************Ejercicio Nº 2: Condicionales*************
        //Resolver los siguientes ejercicios con estructuras selectivas. Intentar ejecutarlos y probarlos con datos de prueba.
        
        /*1)Una  pequeña  despensa  desea  calcular  los  sueldos  de  sus  empleados.  Los  puestos  de  los mismos pueden tener 3 categorías: 1-repositor, 2-cajero y 3-supervisor.
        a)Los repositores cobran $15.890 + un bono de 10%.
        b)Los cajeros cobran $25.630,89 fijos.
        c)Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
        Se necesita una aplicación que, dependiendo el tipo de empleado del que se trate, calcule y muestre en pantalla el correspondiente sueldo.*/
        
        int puesto = 1; //1-repositor, 2-cajero y 3-supervisor
        double sueldo;
        double sueldoFinal;
        
        if (puesto == 1) {
            sueldo = 15890;
            sueldoFinal = sueldo + (sueldo * 0.1);
        } else {
            if (puesto == 2) {
                sueldoFinal = 25630.89;
            } else {
                sueldo = 35560.20;
                sueldoFinal = sueldo - (sueldo * 0.11);
            }
        }
        
        System.out.println("El sueldo que le corresponde es $" + sueldoFinal);
        
        /*2)Una mercería vende canutillos y mostacillas al por mayor mediante su página web. Como se trata de una mercería mayorista, solicita la cantidad de paquetes en cada venta y dependiendo de esta realiza los siguientes controles:
        a)Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando que no se permiten compras inferiores a 5 productos.
        b)Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: Se debe emitir un mensaje que el costo de envío es de $200.
        c)Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se debe emitir un mensaje de que el envío es gratuito.
        Realizar el programa necesario para llevar a cabo los 3 controles citados.*/
        
        int cantidad = 5;
        
        if (cantidad < 5) {
            System.out.println("No se permiten compras inferiores a 5 productos");
        } else {
            if (cantidad <= 15) {
                System.out.println("El costo de envío es de $200");
            } else {
                System.out.println("El envío es gratuito");
            }
        }
        
        /*3)Un  instituto  de  inglés  desea  informar  a  sus  alumnos  los  días  y  horarios de sus  clases.  Para ello, decidió la creación de una aplicación que, a partir del ingreso de la edad del alumno, le informe en  qué  días  y  horarios  los  alumnos tienen  clases.  Como  información,  la  academia proporciona los siguientes datos respecto a los grupos y los diferentes horarios.
        a)Kinder(de 4 a 6 años inclusive): Lunes y Miércoles de 16 a 17
        b)1st year(de7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30
        c)2nd year(de 9a 10 años inclusive): Martes y Jueves de 17:30 a 19
        d)3rd year(de 11 a 13 años inclusive): Lunes y Miércoles de 17 a 18:30
        Realizar  el  programa  solicitado  por  el  instituto, donde  a  partir  del  ingreso  de  la  EDAD  del alumno, el sistema informe por pantalla los días y horarios de cursada.*/
        
        int edad = 12;
        
        if (edad >= 4 && edad <= 6) {
            System.out.println("Kinder\tDías de cursada: Lunes y Miércoles de 16 a 17");
        } else if (edad >= 7 && edad <= 8) {
            System.out.println("1st year\tDías de cursada: Martes y Jueves de 16:30 a 17:30");
        } else if (edad >= 9 && edad <= 10) {
            System.out.println("2nd year\tDías de cursada: Martes y Jueves de 17:30 a 19");
        } else if (edad >= 11 && edad <= 13) {
            System.out.println("3rd year\tDías de cursada: Lunes y Miércoles de 17 a 18:30");
        }
        
    }
    
}
