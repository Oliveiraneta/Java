import java.util.Scanner;
public class testeWhile{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    int numero = 5;
    int cont;

    cont = 0;

    while (cont <= 10){
            System.out.println(numero + "x" + cont + "=" + (numero * cont));
            cont = cont + 1;
     }
    }
}
