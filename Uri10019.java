import java.util.Scanner;

public class Uri10019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int duracao;
        int resto;
        int hora;
        int minutos;
        int segundos;

      duracao = teclado.nextInt();
      
      hora = duracao / 3600;
      resto = duracao % 3600;

      minutos = resto / 60;
      segundos = resto % 60;
                 
      System.out.printn(hora + ":" + minutos + ":" + segundos);
    }
}