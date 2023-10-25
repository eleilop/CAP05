public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás");
        int contador = 320;
        do {
            System.out.print(contador+" ");
            contador=contador-20;
        } while (contador>=160);
    }
}
