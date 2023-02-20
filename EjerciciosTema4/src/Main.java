import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("|| EJERCICIO DEL IF ||");

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numeroIf = num.nextInt();
        if(numeroIf > 0){
            System.out.println("es positivo");
        }else if(numeroIf < 0){
            System.out.println("es negativo");
        }else{
            System.out.println("es cero");
        }


        System.out.println("|| EJERCICIO DEL WHILE ||");

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //Mostrarlo por pantalla cada vez que se ejecute.

        Scanner nume = new Scanner(System.in);
        System.out.println("Ingrese un numero");

        int numeroWhile = nume.nextInt();

        while (numeroWhile < 3){
            System.out.println("El numero: " + numeroWhile);
            numeroWhile++;
        }

        System.out.println("|| EJERCICIO DEL DO WHILE ||");

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        int numerodowhile = 2;

        do {
            System.out.println(numerodowhile);
            numerodowhile++;
        }while (numerodowhile < 3);

        System.out.println("|| SENTENCIA FOR ||");

        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        for(int numeroFor = 0; numeroFor < 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("|| SENTENCIA SWITCH");

        //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

        var estacion = "Verano";

        switch (estacion){
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Estacion no encontrada");

        }
    }
}