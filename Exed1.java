import java.util.Scanner;

public class Exed1 {
     public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Digite um número meu nóbre: ");
     int numy = sc.nextInt();

     boolean Primão = verificarmeuPrimo(numy);

         if (Primão) {
         System.out.println(numy + " é meu primo!");
        } else {
         System.out.println(numy + " não é meu primo!");
        }

     sc.close();

    }

     private static boolean verificarmeuPrimo(int numy) {

        if (numy <= 1) {

         return false;
         //Esse é o código que verifica se o numy(Número) é menor ou igual a 1, se ele for, ele volta pro boolean do inicio com a info de qu ele não é primo

        }

        for (int i = 2; i <= Math.sqrt(numy); i++) {

             if (numy % i == 0) {

             return false; 
             //Esta parte, já pega e intera de 2 até a raiz quadrada do tal numy(Número) colocado, usando "math.sqrt" e da um loop com o "for"
             //E no "numy %i==0" ele vê se é divisível pelo valor atual, se não for não é primo, logo "false", se for "true", aí é primo
             
            }
        }

     return true; 

    }
}