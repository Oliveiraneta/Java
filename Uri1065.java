  
import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

       // double numero, soma = 0.0;
        int qtdPares = 0;
        int numero;

        for (int cont=1 ; cont <=5 ; cont++){
            numero = teclado.nextInt();
        if (numero % 2 == 0){
                qtdPares++;
     //           soma = soma + numero;
            }
        }
        System.out.println(qtdPares+ " valores pares");
     //    System.out.printf("%.1f\n", (soma / qtdPositivos));
    }
}