import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa muestra los n primeros términos de la serie de Fibonacci.");
        System.out.print("Introduce la cantidad de números a mostrar: ");
        int valores = sc.nextInt();
        sc.close();
        System.out.print("0 ");
        long n1 = 1;
        long n2 = 0;
        for (int i=1; i<valores; i++) {
            System.out.print(n1+n2+" ");
            long aux = n1;
            n1 = n2;
            n2 = aux+n2;
        }
    }
}
