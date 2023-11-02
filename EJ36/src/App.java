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
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca un número: ");
        long valor = Long.parseLong(System.console().readLine());
        System.out.printf("El %d %s", valor, valor==voltea(valor)?"es capicúa":"no es capicúa");
    }
}