import java.util.Scanner;
public class practica1 {
    public static void main(String[] args) {

        System.out.println("Momento inicial");
        System.out.println("================");
        System.out.println("Introduce la hora:");
        Scanner sc = new Scanner(System.in);
        int hora1 = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int minuto1 = sc.nextInt();
        System.out.println("Introduce los segundos");
        int segundos1 = sc.nextInt();
        System.out.println(" ");
        System.out.println("Momento final");
        System.out.println("================");
        System.out.println("Introduce la hora:");
        int hora2 = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int minuto2 = sc.nextInt();
        System.out.println("Introduce los segundos");
        int segundos2 = sc.nextInt();
        System.out.println("Datos introducidos: Momento inicial " + hora1 + (":") + minuto1 + (":") +segundos1 + "  Momento final " + hora2 + (":") + minuto2 + (":") +segundos2);

        int multi1 = ((hora1 * 3600) + (minuto1 * 60) + segundos1 );
        int multi2 = ((hora2 * 3600) + (minuto2 * 60) + segundos2 );
        int resta = (multi2 - multi1);
        int horafinal = (resta / 3600);
        int minfinal = ((resta - horafinal * 3600) /60);
        int segfinal = (resta - horafinal *3600 - minfinal * 60);
        System.out.println(horafinal + (":") +  minfinal + (":") +  segfinal);
    }
}

