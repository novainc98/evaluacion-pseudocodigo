package menu;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int option;
            do {
                imprimirMenu();
                option = Integer.parseInt(input.nextLine());
                ejecucionMenu(option, input);
            } while (option != 3);
        }
    }

    public static void imprimirMenu() {
        System.out.println("************ MENU *************");
        System.out.println("[1] Calcular área de un rectángulo");
        System.out.println("[2] Crear un arreglo unidimensional con la dimensión n");
        System.out.println("[3] Salir");
        System.out.print("Ingrese un número del menú: ");
    }

    public static void ejecucionMenu(int option, Scanner input) {
        switch (option) {
            case 1:
                calcularArea(input);
                break;
            case 2:
                dimensionarArreglo(input);
                break;
            case 3:
                System.out.println("Termina el flujo del programa...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public static void calcularArea(Scanner input) {
        System.out.print("Ingresa el lado 1: ");
        double lado1 = Double.parseDouble(input.nextLine());

        System.out.print("Ingresa el lado 2: ");
        double lado2 = Double.parseDouble(input.nextLine());
        double area = lado1 * lado2;
        System.out.println("El área es: " + area);
    }

    public static void dimensionarArreglo(Scanner input) {
        System.out.print("Ingresa el tamaño del arreglo: ");
        int size = Integer.parseInt(input.nextLine());

        if (validarTamanio(size)) {
            int[] arreglo = new int[size];
            // Llenar el arreglo con números de n a 1
            for (int i = 0; i < size; i++) {
                arreglo[i] = size - i;
            }
            // Mostrar elementos de la mitad de n a n
            System.out.println("Elementos del arreglo desde la mitad hasta el final:");
            for (int i = size / 2; i < size; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Tamaño para dimensionar arreglo inválido");
        }
    }

    private static boolean validarTamanio(int size) {
        return size > 0;
    }
}
