import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Introduce el ejercicio a resolver");
            System.out.println("1. For");
            System.out.println("2. While");
            int tipo = sc.nextInt();
            if (tipo == 1) {
                Ej11For();
                flag= false;
            } else if (tipo == 2) {
                Ej7();
                flag= false;
            } else {
                System.out.println("Opción incorrecta");
            }
        }
    }

    public static void Ej11For(){
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();

        System.out.println("b");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.println("caracter");
        String cad = sc.nextLine();
        char caracter = cad.charAt(0);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(caracter);
            }
            System.out.print('\n');
        }
    }

    public static void Ej7() {
        System.out.println("Vamos a encontrar un numero al azar entre 1 y 100");
        System.out.println("Si en algun momento deseas rendirte, teclea 0");
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 100 + 1);
        int numAleatorio;
        do {
            System.out.println("Introduce un número");
            numAleatorio = sc.nextInt();
            if (num == numAleatorio) {
                System.out.println("Felicidades, has encontrado el numero");
            } else if (numAleatorio == 0) {
                return;
            } else if (numAleatorio > 100) {
                System.out.println("El número esta fuera de rango");
            } else if (numAleatorio < 1) {
                System.out.println("El número esta fuera de rango");
            } else if (num < numAleatorio) {
                System.out.println("El número introducido es menor de " + numAleatorio);
            } else if (num > numAleatorio) {
                System.out.println("El número introducido es mayor de " + numAleatorio);
            }
        }
        while (num != numAleatorio);
    }
}