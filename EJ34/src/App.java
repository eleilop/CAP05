public class App {
    public static long mezclar(long valor1, long valor2) {
        long mezcla = 0;
        boolean salida = false;
        while (!salida) {
            int digito1 = (int) (valor1%10);
            int digito2 = (int) (valor2%10);
            mezcla = (mezcla*10+digito1)*10+digito2;
            if (valor1<10)
                salida = true;
            else
                valor1 = valor1/10;
                valor2 = valor2/10;
        }
        return mezcla;
    }
    public static String imprimirPares(long valor) {
        String res = "";
        boolean salida = false;
        while (!salida) {
            int digito = (int) (valor%10);
            if (digito%2==0)
                System.out.print(digito);
        }
        return res;
    }
    public static String imprimirImpares(long valor) {
        String res = "";
        boolean salida = false;
        while (!salida) {
            int digito = (int) (valor%10);
            if (digito%2!=0)
                System.out.print(digito);
        }
        return res;
    }
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un número: ");
        long valor1 = Long.parseLong(System.console().readLine());
        System.out.print("Introduce otro número: ");
        long valor2 = Long.parseLong(System.console().readLine());
        long mezcla = mezclar(valor1, valor2);
        System.out.printf("El número formado por dígitos pares es %s%n", imprimirPares(mezcla));
        System.out.printf("El número formado por dígitos impares es %s%n", imprimirImpares(mezcla));
    }
}
