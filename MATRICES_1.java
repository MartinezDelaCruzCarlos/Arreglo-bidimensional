package matrices_1;

import java.util.Random;

/**
 *
 * @author MARTINEZ DE LA CRUZ CARLOS
 */
public class MATRICES_1 {

    public static void main(String[] args) {
        // MATRIZ DE 10X1O INGRESADO POR TECLADO SUME LA DIAGONAL PRIMARIA Y SECUNDARIA
        Random rd = new Random();
        int i;
        int[][] matriz = new int[3][3];
        // rellenamos matrices
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                /* System.out.print("Ingrese el valor de celda [" + i + "][" + j + "]:");
                matriz[i][j] = sc.nextInt(); (esto se usa cuando importal "Scanner") */
                matriz[i][j] = rd.nextInt(99 - 10 + 1) + 10;
            }
        }
        // impresion de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("");
        }

        {
            int diagonalPrincipal[] = new int[matriz.length];
            int diagonalSecundaria[] = new int[matriz.length];
            for (i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == j) {
                        diagonalPrincipal[i] = matriz[i][j];
                    }
                    if ((i + j) == matriz.length - 1) {
                        diagonalSecundaria[i] = matriz[i][j];
                    }
                }

            }
            int suma1 = 0;
            int suma2 = 0;
            System.out.println("\nEste es tu diagonal principal");
            for (int elemento : diagonalPrincipal) {
                System.out.print("\t" + elemento);
                suma1 = suma1 + elemento;
                System.out.println("");
            }
            System.out.print(" Suma de tu diagonal principal : " + suma1);
            System.out.println("");

            System.out.println("\nEste es tu diagonal secundaria");
            for (int elemento : diagonalSecundaria) {
                System.out.print("\t" + elemento);
                suma2 = suma2 + elemento;
                System.out.println("");
            }
            System.out.print("Suma de tu diagonal secundaria: " + suma2);
            System.out.println("");
            int sumatotal = 0;
            sumatotal = suma1 + suma2;
            System.out.print("\nESTA ES LA SUMA TOTAL DE AMBAS DIAGONALES: " + sumatotal);
            System.out.println("");
        }

    }
}
