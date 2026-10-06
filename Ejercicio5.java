import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El número es múltiplo de 3 y de 5 al mismo tiempo.");
        } else {
            System.out.println("El número NO es múltiplo de 3 y de 5 al mismo tiempo.");
        }
        scanner.close();
    }
}