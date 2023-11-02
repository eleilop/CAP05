public class App {
    public static int longitud(int valor) {
        boolean salida = false;
        int retorno = 0;
        while (!salida) {
            int digito = valor%10;
            System.out.print(digito);
            retorno++;
            if (valor<10)
                salida=true;
            else
                valor = valor/10;
        }
        return retorno;
    }

    public static int voltea(int valor) {
        int alreves = 0;
        boolean salida = false;
        int posicion = 0;
        while (!salida) {
            int digito = valor%10;
            System.out.print(digito);
            posicion++;
            if (valor<10)
                salida=true;
            else
                valor = valor/10;
        }
        return alreves;
    }
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca un número entero: ");
        int valor = Integer.parseInt(System.console().readLine());
        voltea(valor);
    }
}