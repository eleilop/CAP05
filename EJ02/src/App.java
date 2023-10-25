public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Muestra los números múltiplos de 5 de 0 a 100");
        int contador = 0;
        while (contador<=100) {
            if (contador%5==0)
                System.out.print(contador+" ");
            contador++;
        }
    }
}
