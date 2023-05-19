import java.util.Scanner;

public class Exgus2 {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int acima50 = 0;
     int abaixo40kg = 0;
     int entre1e2m = 0;

         for (int i = 1; i <= 5; i++) {
         System.out.println("Pessoa \n" + i);

         System.out.println("Informe a idade da pessoa: \n");
         int idade = sc.nextInt();

         System.out.println("Informe a altura da pessoa: \n");
         double altura = sc.nextDouble();

         System.out.println("Informe o peso da pessoa: \n");
         double peso = sc.nextDouble();

             if (idade > 50) {
             acima50++;
            }
             if (peso < 40) {
             abaixo40kg++;
            }
             if (altura >= 1 && altura <= 2) {
             entre1e2m++;
            }
        }

     System.out.println("Aqui está a quantidade de pessoas acima de 50 anos: \n" + acima50);
     System.out.println("Aqui está a quantidade de pessoas abaixo de 40kg: \n" + abaixo40kg);
     System.out.println("Aqui está a quantidade de pessoas entre 1m e 2m de altura: \n" + entre1e2m);

     System.out.println("Fim do programa\n");

     sc.close();

    }
}
    