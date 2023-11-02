import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int filas = sc.nextInt();
        sc.close();
        for (int i=1; i<=filas; i++) {
            for (int j=1; j<=filas-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i*2-1; k++) {
                if (k<=i)
                    System.out.print(k);
                else
                    System.out.print(i*2-k);
            }
            System.out.println("");
        }
    }
}