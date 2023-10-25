import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String secreto = "1234";
        boolean acierto = false;
        for (int i=1;i<=4 && !acierto ;i++) {
            acierto=sc.nextLine().equals(secreto);
            if (!acierto)
                System.out.println("Clave incorrecta");
        }
        sc.close();
        if (acierto)
            System.out.println("Has abierto la caja fuerte");
        else
            System.out.println("Lo siento, has perdido las 4 oportunidades");
    }
}