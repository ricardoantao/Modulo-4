package fibonacci;
import java.util.Scanner;
public class fibonacci {

public static void main(String[] args) {
	
    Scanner LerS = new Scanner(System.in);
    System.out.println("Escreva a quantidade de termos:");
    int numero1 = 0;
    int numero2 = 1;
    for (int quantidade = LerS.nextInt(); quantidade > 0; quantidade--) {
    System.out.print(numero1 + " ");
    int numero3 = numero1 + numero2;
    numero1 = numero2;
    numero2 = numero3;
 
}
}
}

