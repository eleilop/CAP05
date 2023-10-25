import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa nos dice cuántos dígitos tiene un número introducido por teclado.");
        System.out.print("Introduce el número: ");
        long numero = sc.nextLong();
        long numeroMostrado = numero;
        sc.close();
        int contador = 0;
        while(numero/10!=0) {
            numero=numero/10;
            contador++;
        }
        System.out.printf("El número %d tiene %d dígito/s", numeroMostrado, ++contador);
    }
}
