package menu2;

import java.util.Arrays;

public class Principal3 {
    public static void main(String[] args) {
        int[] arregloOpciones = {1, 2, 5, 2, 1, 2, 9, 7, 3};
//        int[] arregloOpciones = {3, 2, 5, 2, 6, 2, 9, 7, 3}; //el 3 es el inicio
//        int[] arregloOpciones = {2, 2, 5, 2, 1, 2, 9, 7, 3}; //
//        int[] arregloOpciones = {1, 2, 5, 1}; //
//        int[] arregloOpciones = {1, 2, 5, 1,1,3,3,3}; //
//        int[] arregloOpciones = {1, 2, 5, 1,2}; //
//        int[] arregloOpciones = {1, 2, 5, -4, 2}; //

        int totalElemenosDelArr = arregloOpciones.length;
        System.out.println("arregloOpciones = " + Arrays.toString(arregloOpciones));
        for (int i = 0; i < totalElemenosDelArr; i++) {
            int valorActual = arregloOpciones[i];
            if (validarElemento(valorActual)) {
                switch (valorActual) {
                    case 1:
                        if (i == totalElemenosDelArr - 1) {
                            System.out.println(valorActual);
                            System.out.println("no hay mas elementos para calcular el area");
                        } else if ((i + 2) >= totalElemenosDelArr - 1) {
                            System.out.println(valorActual);
                            System.out.println("solo tienes un elemento para calcular el area");
                            ++i;
                        } else {
                            int lado1 = arregloOpciones[++i];
                            int lado2 = arregloOpciones[++i];
                            System.out.println(valorActual + "," + lado1 + "," + lado2);
                            System.out.println("Area igual a: " + (lado1 * lado2));
                        }
                        break;
                    case 2:
                        if (i == totalElemenosDelArr - 1) {
                            System.out.println(valorActual);
                            System.out.println("No hay mas elementos para dimensionar un arreglo");
                        } else {
                            System.out.print(arregloOpciones[i] + ",");
                            int tamanio = arregloOpciones[++i];
                            System.out.println(tamanio);

                            int[] arr = new int[tamanio];
                            for (int j = 0; j < tamanio; j++) {
                                arr[j] = tamanio - j;
                            }
                            if (tamanio == 1) {
                                System.out.println("arreglo de " + tamanio + " posición creado.");
                            } else {
                                System.out.println("arreglo de " + tamanio + " posiciones creadas.");
                            }
                        }
                        break;
                    case 3:
                        i = totalElemenosDelArr;
                        System.out.println(valorActual);
                        System.out.println("[Termina el programa]");
                        break;
                    default:
                        System.out.println(valorActual);
                        System.out.println("NO existe la opción para este valor: " + valorActual);
                }
            } else {
                System.out.println("Tamaño para dimensionar arreglo inválido");
            }
        }
    }


    private static boolean validarElemento(int valorActual) {
        return valorActual > 0;
    }
}
