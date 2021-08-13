    import java.util.Scanner;

        public class Main {

        public static void main(String args[]){

            Scanner teclado = new Scanner (System.in);

            int func;
            int hora;
            double custo;
            double salario;


            func = teclado.nextInt();
            hora = teclado.nextInt();
            custo = teclado.nextDouble();

            salario = hora * custo;

            System.out.println("NUMBER = " + func);
            System.out.printf("SALARY = U$ %.2f\n" , salario);
        }
        }
        