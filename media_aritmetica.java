package media_aritmetica;
import java.util.Scanner;	
public class media_aritmetica {
public static void main (String [] args) throws Exception{
    int n ,i;
    double med=0;
    Scanner dados=new Scanner(System.in);
    System.out.print("Quantos elementos tem a m�dia?");
    n=dados.nextInt();
    double []A=new double[n];
    for(i=0; i<=n-1;i++)
    {System.out.println("Qual � o Elemento "+ (i+1));
        A[i]=dados.nextDouble();}
        for(i=0;i<=n-1;i++)
            med+=A[i];
            med=med/n;
    System.out.print(String.format("A M�dia � %5.2f",med));
}
}