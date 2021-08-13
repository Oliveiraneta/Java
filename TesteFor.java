import java.util.Scanner;
public class testeFor{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    
    int numero = 5;
 
           for (int cont = 1; cont <= 10; cont = cont +1){
            System.out.println(numero + "x" + cont + "=" + (numero * cont));
            }
     }      
}
