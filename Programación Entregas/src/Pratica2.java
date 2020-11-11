import java.util.Scanner;
public class Pratica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número entero");

        int num1 = sc.nextInt();
        if (num1 >= 0) {
            System.out.println(" ");
            System.out.println("Introduce el segundo número entero");
        } else if (num1 <= 0) {
            System.out.println(" ");
            System.out.println ("No es un número positivo.");
        }

        int num2 = sc.nextInt();
        if (num2 >= 0) {
            System.out.println(" ");
            System.out.println("Ahora introduce el tipo de operación que quieres realizar (+, -, *, /)");
        } else if (num1 <= 0) {
            System.out.println(" ");
            System.out.println ("No es un número positivo.");
        }

        char caracter;
        caracter = sc.next().charAt(0);
        switch (caracter) {
            case '+':
                int suma = num1 + num2;
                System.out.println(" ");
                System.out.println("La suma de " + num1 + " y " + num2 + " es igual " + suma);
                break;

            case '-':
                int resta = num1 - num2;
                System.out.println(" ");
                System.out.println("La resta de " + num1 + " y " + num2 + " es igual " + resta);
                break;

            case '*':
                int multi = num1 * num2;
                System.out.println(" ");
                System.out.println("La multiplicación de " + num1 + " y " + num2 + " es igual " + multi);
                break;

            case '/':
                int divi = num1 / num2;
                System.out.println(" ");
                System.out.println("La división de " + num1 + " y " + num2 + " es igual " + divi);
                break;

            default:
                System.out.println(" ");
                System.out.println("El operando no es correcto");
        }
    }
}
