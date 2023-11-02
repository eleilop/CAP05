public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa pinta una L con asteriscos.");
        System.out.print("Introduce una altura: ");
        int altura = Integer.parseInt(System.console().readLine());
        for (int i=1; i<altura; i++) 
            System.out.println("*");
        for (int i=1; i<=altura/2+1; i++)
            System.out.print("* ");
    }
}