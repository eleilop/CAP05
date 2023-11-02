public class App {
    public static void pintarU(long altura) {
        for (int i = 1; i<=altura; i++) {
            if (i<altura) {
                System.out.print("*");
                for (int j = 1; j<=altura; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println("");
            }
            else {
                System.out.print(" ");
                for (int j = 1; j<=altura; j++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca la ultura de la U: ");
        int altura = Integer.parseInt(System.console().readLine());
        pintarU(altura);
    }
}
