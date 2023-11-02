public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.");
        int comprobador = 0;
        for (int i=2; i<=100; i++) {
            for (int j=2; j<=i/2; j++) {
                if (i%j==0)
                    comprobador++;
            }
            if (comprobador==0)
                    System.out.print(i+" ");
            comprobador=0;
        }
    }
}