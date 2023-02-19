import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


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
    }
}