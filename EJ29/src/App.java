public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa muestra por pantalla todos los números enteros positivos menores a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.");
        System.out.print("Introduce el número máximo: ");
        int maximo = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el número divisor: ");
        int divisor = Integer.parseInt(System.console().readLine());

        for (int i=0; i<maximo; i++) {
            if (i%divisor==0)
                System.out.print(i+" ");
        }
    }
}