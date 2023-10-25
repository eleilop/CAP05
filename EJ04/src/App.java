public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás");
        for (int contador=320; contador>=160; contador=contador-20) {
            System.out.print(contador+" ");
        }
    }
}
