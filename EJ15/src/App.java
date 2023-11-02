import java.util.Scanner;

public class App {
    public static double potencia(int base, int exp) {
        double ret = 1;
        for (int i=1; i<=Math.abs(exp); i++) {
            ret*=base;
        }
        return (exp<0)?1/ret:ret;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        int base = sc.nextInt();
        System.out.print("Introduzca la potencia: ");
        int exp = sc.nextInt();
        int absexp = Math.abs(exp);
        sc.close();
        for (int i = 1; i<=absexp; i++) {
            System.out.printf("%d^"+((exp<0)?"(":"")+"%d"+((exp<0)?")":"")+" = %.2f%n", base, exp<0?-i:i, potencia(base, exp));
        }
    }
}