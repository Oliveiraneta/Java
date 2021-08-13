import java.util.Scanner;

public class Uri10014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int distancia;
        double litros;
        double consumo;

      distancia = teclado.nextInt();
      litros = teclado.nextDouble();
    
      consumo = distancia / litros;
    
      System.out.printf("%.3f km/l\n" , consumo);
    
    }
}