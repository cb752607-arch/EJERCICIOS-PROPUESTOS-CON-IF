import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        if (numero >= 20 && numero <= 50) {
            System.out.println("El número está dentro del rango.");
        }
        scanner.close();
    }
}