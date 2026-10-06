import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una nota: ");
        double nota = scanner.nextDouble();
        
        if (nota >= 17) {
            System.out.println("Alumno destacado.");
        }
        scanner.close();
    }
}