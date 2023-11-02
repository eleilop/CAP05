import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pide números hasta que introduzcas un número negativo.");
        int numero = 0;
        int contador = 0;
        int sumaImpares = 0;
        int contadorImpares = 0;
        int mayorPar = 0;
        while (numero>=0) {
            System.out.print("Introduce un número: ");
            numero = sc.nextInt();
            if (numero>=0) {
                contador++;
                if (numero%2!=0) {
                    sumaImpares += numero;
                    contadorImpares++;
                }
                else if (numero%2==0 && numero>mayorPar)
                    mayorPar=numero;
            }
        }
        sc.close();
        if (contadorImpares==0)
            contadorImpares=1;
        System.out.printf("Números introducidos: %d%nMedia de impares: %d%nMayor de los pares: %d", contador, sumaImpares/contadorImpares, mayorPar);
    }
}