import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        // Evaluamos tanto positivos como negativos de 3 cifras (100 a 999 o -100 a -999)
        if ((numero >= 100 && numero <= 999) || (numero <= -100 && numero >= -999)) {
            System.out.println("El número tiene tres cifras.");
        } else {
            System.out.println("El número NO tiene tres cifras.");
        }
        scanner.close();
    }
}