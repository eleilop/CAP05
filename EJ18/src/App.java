import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int valor1 = sc.nextInt();
        System.out.print("Introduzca otro número entero distinto al anterior: ");
        int valor2 = sc.nextInt();
        sc.close();
        if (valor1>valor2){
            int aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }
        int sig = valor1;
        while(sig<=valor2) {
            System.out.print(sig+" ");
            sig+=7;
        }

    }
}
