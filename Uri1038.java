import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double valor;
        int cod;
        int qtde;
        double preco;

        cod = teclado.nextInt();
        qtde = teclado.nextInt();
        preco = 0.0;

        if ( cod == 1 ) {
            preco = 4.00;
        }
        else if (cod == 2){
            preco = 4.50;
        }
        else if (cod == 3){
            preco = 5.00;
        }
        else if (cod == 4 ){
            preco = 2.00;
        }
        else if (cod == 5){
            preco = 1.50;
       }
       valor = qtde * preco;
       System.out.printf("Total: R$ %.2f\n", valor);

       }
    }
