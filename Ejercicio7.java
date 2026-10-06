import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura (°C): ");
        double temperatura = scanner.nextDouble();
        
        if (temperatura > 35) {
            System.out.println("Temperatura extrema.");
        }
        scanner.close();
    }
}