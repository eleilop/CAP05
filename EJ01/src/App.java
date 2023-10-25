public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa muestra los números múltiplos de 5 de 0 a 100.");
        for (int contador=0; contador<=100; contador++) {
            if (contador%5==0)
                System.out.print(contador+" ");
        }
    }
}
