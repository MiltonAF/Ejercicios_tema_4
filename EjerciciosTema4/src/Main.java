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
    }
}