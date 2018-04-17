package matriz;

import java.util.Scanner;

public class matriz {

public static void main(String[] args) {

	 int L, C;
     Scanner LerS = new Scanner(System.in);
     System.out.print("Insira o numero de linhas:");
	 L = LerS.nextInt();
	 System.out.print("Insira o numero de colunas:");
	 C = LerS.nextInt();
	 int[][] matriz = new int[L][C];
	 for (L = 0; L < 2; L++) {
	 for (C = 0; C < 1; C++) {
	 System.out.printf("Insira o elemento M[%d][%d]: ", L, C);
	 matriz[L][C] = LerS.nextInt();
 }
 }
     System.out.println("\nA Matriz ficou: \n");
	 for (L = 0; L < 2; L++) {
	 for (C = 0; C < 1; C++) {
	 System.out.printf("\t %d \t", matriz[L][C]);
	            }
	        }
	    }
	}