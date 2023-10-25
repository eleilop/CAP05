import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa que calcule la media de un conjunto de números positivos introducidos por teclado. Para dejar de introducir número introduzca un número negativo.");
        boolean salir = false;
        System.out.print("Vaya introduciendo números: ");
        float numero = 0f;
        float suma = 0f;
        int contador = 0;
        while (!salir) {
            numero = sc.nextFloat();
            if (numero<0)
                salir=true;
            else
                contador++;
                suma=suma+numero;
        }
        sc.close();
        System.out.printf("La media de los número positivos introducidos es %.2f", (suma-numero)/contador);
    }
}
