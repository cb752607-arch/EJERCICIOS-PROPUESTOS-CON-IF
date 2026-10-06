import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la nota de Matemática: ");
        double notaMatematica = scanner.nextDouble();
        
        System.out.print("Ingrese la nota de Comunicación: ");
        double notaComunicacion = scanner.nextDouble();
        
        if (notaMatematica >= 11 && notaComunicacion >= 11) {
            System.out.println("Postulante apto.");
        } else {
            System.out.println("Postulante no apto.");
        }
        scanner.close();
    }
}