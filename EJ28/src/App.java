public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa calcula el factorial de un número entero leído por teclado.");
        System.out.print("Introduce un número: ");
        try {
            int numero = Integer.parseInt(System.console().readLine());
            long factorial = numero;

            for (int i=1; i<numero; i++) {
                factorial *= i;
            }
            if (numero==0)
                System.out.print("El factorial de 0 es 1");
            else if (numero<0)
                System.out.print("No se puede hacer el factorial de un número negativo");
            else
                System.out.printf("El factorial de %d es %d", numero, factorial);
        } catch (Exception e) {
            System.out.print("Lo siento, no le he entendido");
        }
    }
}