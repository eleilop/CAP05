import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        int valor = 0;
        while (!correcto) {
            try {
                System.out.print("Introduzca un número entero positivo: ");
                valor = sc.nextInt();
                correcto = valor>=0;
                if (!correcto)
                    System.out.println("El número introducido no es correcto");
            } catch (Exception e){
                System.out.println("El número introducido no es correcto");
            }
        
        }
        sc.close();
        int suma = 0;
        for (int i=valor; i<=(valor+100); i++) {
            suma+=i;
        }
        System.out.printf("La suma de los 100 números siguientes a %d es %d", valor, suma);
    }
}
