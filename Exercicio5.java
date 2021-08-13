import java.util.Scanner;

public class Exercicio5{
    public static void main(String args[]){
        Scanner teclado = teclado = new Scanner(System.in);

        double qtdelitros;
        double litrosconsumidos;
        double distancia;
        double tempoviagem;
        double velocidade;

      
        System.out.println("Digite o tempo gasto na viagem:");
        tempoviagem = teclado.nextDouble();
        
        System.out.println("Digite a velocidade:");
        velocidade = teclado.nextDouble();

        distancia = velocidade * tempoviagem;
        litrosconsumidos = distancia / 12;
        
        System.out.printf(" A quatidade de litros e : %2f\n" , litrosconsumidos);
        
    
    }
}