package org.example;

import java.util.Scanner;

public class Main {

    public static void exibeMatriz (int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Declaracao e criacao de um vetor

        int[] vetor = new int[10];

        // Declaracao e criacao de uma matriz

        int[][] matriz = new int[3][4];

        // Declaracao e criacao de uma matriz ja inicializada com valores

        int[][] matriz2 = { {1,2}, {3,4}, {5,6}, {7,8} };

        // Declaracao e criacao de uma matriz irregular, com quantidade
        // de colunas diferente em cada linha
        int[][] matrizLoka = { {1}, {2,3,4,5}, {6,7}, {8,9,10} };

        // Declaracao e criacao de outra matriz irregular
        int[][] matrizLoka2 = new int[4][];
        matrizLoka2[0] = new int[7];
        matrizLoka2[1] = new int[2];
        matrizLoka2[2] = new int[8];
        matrizLoka2[3] = new int[6];

        // Solicita que o usuario digite os valores da matriz

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor de matriz [" + linha +
                        "] [" + coluna + "]");
                matriz[linha][coluna] = leitor.nextInt();
            }
        }

        System.out.println("Exibição de matriz");
        exibeMatriz(matriz);

        System.out.println("\nExibição da matriz 2");
        exibeMatriz(matriz2);

        System.out.println("\nExibição da matriz loka");
        exibeMatriz(matrizLoka);

    }
}