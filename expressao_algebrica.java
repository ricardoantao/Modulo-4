package expressao_algebrica;
import java.util.Scanner;
public class expressao_algebrica {
public static void main(String[] args) {
Scanner LerS = new Scanner(System.in);	


int declive;
int ordenada;
int objeto;	


System.out.println("Insira o valor do declive: ");		
declive = LerS.nextInt();

System.out.println("Insira o valor da ordenada na origem: ");
ordenada = LerS.nextInt();

System.out.println("Expressao Algébrica: f(x) = " +declive+"x + "+ordenada);
		
System.out.println("Insira o objeto: ");
objeto = LerS.nextInt();

System.out.println("Imagem: f("+objeto+") = "+(declive*objeto+ordenada));

}}