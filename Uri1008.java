import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = teclado = new Scanner(System.in);

        int numFunc;
        int  numHora;
        double valorhora;
        double SALARIO;

      

      numFunc= teclado.nextInt();
      numHora = teclado.nextInt();
      valorhora = teclado.nextDouble();

      SALARIO = numHora * valorhora;
    
      System.out.printf("NUMBER = %d\n", numFunc);
      System.out.printf("SALARY = US %.2f\n" , SALARIO);

           
    }
}