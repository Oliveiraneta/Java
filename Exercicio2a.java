import java.util.Scanner;

public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado = teclado = new Scanner(System.in);

        double valorLado;
        double valorArea;
        
        System.out.println("Digite um valor do lado:");
        valorLado = teclado.nextInt();

        valorArea = valorLado * valorLado;
        
              System.out.printf("Valor da area e %.3f\n" , valorArea);
    }
}