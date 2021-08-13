import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = teclado = new Scanner(System.in);

        double area;
        double altura;
        double base;
        
        System.out.println("Digite um valor da altura:");
        altura = teclado.nextDouble();
        
        System.out.println("Digite um valor da base:");
        base = teclado.nextDouble();

        area = altura * base /2;
        
              System.out.printf("Valor da area e %.3f\n" , area);
    }
}