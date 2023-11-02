import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca el caracter de relleno: ");
        String caracter = ""+sc.nextLine().charAt(0);
        sc.close();
        for (int i=1; i<=altura; i++) {
            for (int j=1; j<=altura-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
