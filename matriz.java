package matriz;

import java.util.Scanner;

public class matriz {

public static void main(String[] args) {

    int L, C;
    Scanner Lers = new Scanner(System.in);
    System.out.print("Insira o numero de linhas:");
    L = Lers.nextInt();
    System.out.print("Insira o numero de colunas:");
    C = Lers.nextInt();
    int[][] matriz = new int[L][C];
    for (int i = 0; i < L; i++) {
        for (int j = 0; j < C; j++) {
        System.out.print("Insira o elemento da linha " + (i + 1) + " da coluna " + (j + 1) + ": ");
        matriz[i][j] = Lers.nextInt();
        System.out.println("");
   }
   }
    System.out.println("\nA Matriz ficou: \n");
    for (int i = 0; i < L; i++) {
    for (int j = 0; j < C; j++) {
    System.out.printf("\t %d \t", matriz[i][j]);
        }}}}   