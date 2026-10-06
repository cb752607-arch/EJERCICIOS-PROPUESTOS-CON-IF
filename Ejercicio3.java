import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto de la compra: ");
        double monto = scanner.nextDouble();
        
        if (monto >= 300) {
            System.out.println("Aplica descuento del 10%.");
        }
        scanner.close();
    }
}