package Atividade; //Puxar da pastinha da atividade//

import java.util.Scanner;

     public class Ex3 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.print("Digite seu primeiro número: ");
         double n1 = sc.nextDouble(); // n = número//
2
         System.out.print("Digite seu segundo número: ");
         double n2 = sc.nextDouble();

         System.out.print("Digite seu terceiro número: ");
         double n3 = sc.nextDouble();

         double maior = n1;

             if (n2 > maior) {
             maior = n2;
             }
             if (n3 > maior) {
             maior = n3;
             }

             System.out.println("O maior número dentre estes é: " + maior);

         sc.close();
  }
}
