package matriz_;

import java.util.Scanner;

public class matriz_ {

public static void main(String[] args) {

    int L, C;
    Scanner LerS = new Scanner(System.in);
    System.out.print("Insira o numero de linhas:");
    L = LerS.nextInt();
    System.out.print("Insira o numero de colunas:");
    C = LerS.nextInt();
    int[][] matriz = new int[L][C];
    for (int i = 0; i < L; i++) {
        for (int j = 0; j < C; j++) {
        System.out.print("Insira o elemento da linha " + (i + 1) + " da coluna " + (j + 1) + ": ");
        matriz[i][j] = LerS.nextInt();
        System.out.println("");
   }}
    System.out.println("\nA Matriz ficou: \n");
    for (int i = 0; i < L; i++) {
    for (int j = 0; j < C; j++) {
    System.out.print(matriz[i][j] + "  ");
    } 
    System.out.println("");
    } 
    System.out.println("\nFim");
   
   }}  