public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa muestra, cuenta y suma los múltiplos de 3 que hay entre 1 y un número leído por teclado.");
        System.out.print("Introduce un número: ");
        int numero = Integer.parseInt(System.console().readLine());
        int contadorMultiplos = 0;
        long suma = 0;

        System.out.printf("Los múltiplos de 3 entre 1 y %d son: ", numero);
        for (int i=1; i<=numero; i++) {
            if (i%3==0) {
                System.out.print(i+" ");
                contadorMultiplos++;
                suma += i;
            }
        }
        System.out.printf("%nMúltiplos de 3 encontrados: %d%nLa suma de los múltiplos es: %d", contadorMultiplos, suma);
    }
}