import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la edad del participante: ");
        int edad = scanner.nextInt();
        
        if (edad >= 15 && edad <= 18) {
            System.out.println("Puede participar en el torneo.");
        }
        scanner.close();
    }
}