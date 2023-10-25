import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa muestra la tabla de multiplicar de un número introducido por teclado");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        sc.close();
        for (int contador=0; contador<=10;contador++) {
            System.out.printf("%d X %d = %d%n", numero, contador, numero*contador);
        }
    }
}
