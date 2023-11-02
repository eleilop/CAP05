public class App {
    public static void imprimirX(int altura) {
        for(int i = 1; i<=altura; i++) {
            for (int j=1; j<=altura; j++) {
                if(i==j || i+j==altura+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce la altura de la X: ");
        int altura = Integer.parseInt(System.console().readLine());
        imprimirX(altura);
    }
}