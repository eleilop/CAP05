import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int numero;
        for (int contador=1; contador<=10; contador++) {
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();
            if (numero>=0)
                contadorPositivos++;
            else
                contadorNegativos++;
        }
        sc.close();
        System.out.printf("Hay %d positivos%n", contadorPositivos);
        System.out.printf("Hay %d negativos", contadorNegativos);
    }
}
