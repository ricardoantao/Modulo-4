package fibonacci;
import java.util.Scanner;
public class fibonacci {

public static void main(String[] args) {
	   Scanner LerS = new Scanner(System.in);
	    System.out.println("Digite a quantidade de termos:");
	    int quantidade = LerS.nextInt();
	    int numero1 = 1;
	    int numero2 = 1;
	    System.out.print("1 ");
	    System.out.print("1 ");
	    quantidade = quantidade - 2;
	    while (quantidade > 0) {
	        System.out.print((numero1+numero2) + " ");
	        int numero3 = numero1+numero2;
	        numero1 = numero2;
	        numero2 = numero3;
	        quantidade--;
}
}
}