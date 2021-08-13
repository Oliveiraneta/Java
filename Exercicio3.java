import java.util.Scanner;

public class Exercicio3{
    public static void main(String args[]){
        Scanner teclado = teclado = new Scanner(System.in);

        double salario;
        double kw;
        double quantidadekw;
        double valorpago;
        double desconto;

      
        System.out.println("Digite um valor do salario:");
        salario = teclado.nextDouble();
        
        System.out.println("Digite a quantidde de kw:");
        quantidadekw= teclado.nextDouble();

        kw = salario /700;
        valorpago = quantidadekw * kw;
        desconto = valorpago * 0.90;

        System.out.printf("O valor do kw e: %2f\n" , kw);
        
        System.out.printf("Valor pago e %.2f\n" , valorpago);

        System.out.printf("Valor pago  com desconto e %.2f\n" , desconto);

    }
}