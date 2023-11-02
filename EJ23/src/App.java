import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        while (suma<=10000) {
            System.out.print("Introduce un número: ");
            suma += sc.nextInt();
            contador++;
        }
        sc.close();
        System.out.printf("Total acumulado: %d%nContador de números: %d%nMedia: %d", suma, contador, suma/contador);
    }
}