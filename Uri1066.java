  
import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

     int qtdPares = 0;
     int qtdParesImpares = 0;
     int qtdePositivos = 0;
     int qtdeNegativos = 0;
     int numero;



        for (int cont=1 ; cont <=5 ; cont++){
            numero = teclado.nextInt();

        if (numero % 2 == 0){
            qtdPares++; }
            
 
        if (numero % 2 != 0){
        qtdParesImpares++; }

         if (numero > 0){
            qtdePositivos ++; } 
                   
         if (numero < 0){
            qtdeNegativos++; } 
                        
     System.out.println(qtdPares + " valor(es) par(es) ");
     System.out.println(qtdParesImpares + " valor(es) impar(es)");
     System.out.println(qtdePositivos  + " valor(es) postivos(s) ");
     System.out.println(qtdeNegativos + " valor(es) negativo(s) ");
     
    }
    }
}


