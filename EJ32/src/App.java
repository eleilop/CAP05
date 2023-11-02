public class App {
    public static long voltea(long valor) {
        long alreves = 0;
        boolean salida = false;
        while (!salida) {
            int digito = (int) (valor%10);
            System.out.print(digito);
            if (valor<10)
                salida=true;
            else
                valor = valor/10;
        }
        return alreves;
    }
    public static long solicitaValor(){
        boolean validado = false;
        long valor = 0;
        while (!validado) {
            try {
                System.out.print("Por favor, introduzca un número entero positivo: ");
                valor = Long.parseLong(System.console().readLine());
            } catch (Exception e) {
                System.out.print("Por favor, introduzca un número entero positivo: ");
            }
        }
        return valor;
    }
    public static String imprimirPares (long valor) {
        String res = "";
        boolean salida = false;
        while (!salida) {
            int digito = (int) (valor%10);
            System.out.print(digito);
            if (valor<10)
                salida=true;
            else
                valor = valor/10;
        }
        return res;
    }
    public static int sumarPares (long valor) {
        int suma = 0;
        boolean salida = false;
        while (!salida) {
            int digito = (int) (valor%10);
            System.out.print(digito);
            if (valor<10)
                salida=true;
            else
                valor = valor/10;
        }
        return suma;
    }
    public static void main(String[] args) throws Exception {
        long valor = solicitaValor();
        valor = voltea(valor);
        System.out.printf("Dígito pares: %s%n", imprimirPares(valor));
    }
}