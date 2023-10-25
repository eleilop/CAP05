import java.util.Scanner;

public class App {
    public static int longitudDeUnNumero(long numero){
        int contador = 0;
        while(numero/10!=0) {
            numero=numero/10;
            contador++;
        }
        return contador++;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        
        for(int i=numero; i<numero+5; i++) {
            
        }
        sc.close();
    }
}
