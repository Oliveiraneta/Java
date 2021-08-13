import java.util.Scanner;
public class testedoWhile{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    int numero = 5;
    int cont;

    cont = 1;
       do{
            System.out.println(numero + "x" + cont + "=" + (numero * cont));
            cont = cont + 1;
     }      while (cont <= 10);
    }
}
