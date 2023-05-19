import java.util.Scanner;

     public class Exgus1 {
         public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

         double soma = 0;

         double menor = Double.MAX_VALUE;
         double maior = Double.MIN_VALUE;
         
             for (int i = 1; i <= 10; i++) {
             System.out.print("Por favor digite o valor da sua compra " + i + ": \n");
             double valor = sc.nextDouble();
             soma += valor;

                 if (valor < menor) {
                 menor = valor;
                }
                 if (valor > maior) {
                 maior = valor;
                }

            }

         double media = soma / 10;

         double diferenca = maior - menor;

         System.out.println("Aqui está a média das compras: \n" + media);

         System.out.println("Aqui está a menor compra: \n" + menor);

         System.out.println("Aqui está a maior compra: \n" + maior);

         System.out.println("Aqui está a diferença entre a maior e a menor compra: \n" + diferenca);


         sc.close();

        }
    }