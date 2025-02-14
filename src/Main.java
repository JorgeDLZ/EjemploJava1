import java.util.Scanner;

public class Saludo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Saludar al usuario
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");

        // Cerrar el scanner
        scanner.close();
    }
}
