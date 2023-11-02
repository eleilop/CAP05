public class App {
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
    
    public static void imprimePosiciones(int valor, int digito) {
        boolean salida = false;
        int posicion = 1;
        while (!salida) {
            int actual = valor%10;
            if (actual == digito) {
                System.out.print(posicion+" ");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca un número entero: ");
        int valor = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca un dígito: ");
        int digito = Integer.parseInt(System.console().readLine());
        System.out.printf("Contando d eizquierda a derecha, el %d ");
        System.out.printf("en las posiciones: ");

    }
}
