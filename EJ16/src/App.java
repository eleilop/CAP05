import java.util.Scanner;

public class App {
    public static boolean esPrimo(int valor) {
        if (valor<=1)
            return false;
        boolean primo = true;
        for (int i=2; primo && i<=valor/2; i++) {
            if(valor%i==0)
                primo = false;
        }
        return primo;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int valor = sc.nextInt();
        sc.close();
        System.out.printf("El número introducido %s", esPrimo(valor)?"es primo":"NO es primo");
    }
}
