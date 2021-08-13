import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = teclado = new Scanner(System.in);

        double basemaior;
        double basemenor;
        double altura;
        double area;
        
        System.out.println("Digite um valor da da maior base:");
        basemaior = teclado.nextDouble();
        
        System.out.println("Digite um valor da menor base:");
        basemenor = teclado.nextDouble();

        System.out.println("digite a altura");
        altura = teclado.nextDouble();

        area = (basemaior + basemenor * altura)/2;
        
              System.out.printf("Valor da area e %.3f\n" , area);
    }
}