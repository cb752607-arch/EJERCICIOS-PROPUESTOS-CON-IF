import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = scanner.nextDouble();
        
        if (sueldo > 3500) {
            System.out.println("Pertenece al grupo de ingresos altos.");
        }
        scanner.close();
    }
}