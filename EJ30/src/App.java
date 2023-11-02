public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Por favor introduzca la primera hora");
            System.out.print("Día: ");
            String dia1 = System.console().readLine().toLowerCase();
            System.out.print("Hora: ");
            int hora1 = Integer.parseInt(System.console().readLine());

            System.out.println("Por favor introduzca la segunda hora");
            System.out.print("Día: ");
            String dia2 = System.console().readLine().toLowerCase();
            System.out.print("Hora: ");
            int hora2 = Integer.parseInt(System.console().readLine());

            int mostrarHora1 = hora1;
            int mostrarHora2 = hora2;

            switch (dia1) {
                case "lunes":
                    break;
                case "martes":
                    hora1=24+hora1;
                    break;
                case "miercoles":
                    hora1=24*2+hora1;
                    break;
                case "jueves":
                    hora1=24*3+hora1;
                    break;
                case "viernes":
                    hora1=24*4+hora1;
                    break;
                case "sabado":
                    hora1=24*5+hora1;
                    break;
                case "domingo":
                    hora1=24*6+hora1;
                    break;
                default:
                    System.out.println("Día no válido");
            }

            switch (dia2) {
                case "lunes":
                    break;
                case "martes":
                    hora2=24+hora2;
                    break;
                case "miercoles":
                    hora2=24*2+hora2;
                    break;
                case "jueves":
                    hora2=24*3+hora2;
                    break;
                case "viernes":
                    hora2=24*4+hora2;
                    break;
                case "sabado":
                    hora2=24*5+hora2;
                    break;
                case "domingo":
                    hora2=24*6+hora2;
                    break;
                default:
                    System.out.println("Día no válido");
            }
            if (hora2-hora1<0)
                System.out.print("Parámetros no válidos");
            else
                System.out.printf("Entre las %d:00h del %s y las %d:00h del %s hay %d hora/s", mostrarHora1, dia1, mostrarHora2, dia2, hora2-hora1);
        } catch (Exception e) {
            System.out.print("Lo siento, no le he entendido.");
        }

        
    }
}