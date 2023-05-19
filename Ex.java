package Atividade; //Puxar da pastinha da atividade//

import java.util.Scanner;

     public class Ex {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Digite o número do primeiro lado: ");
     double lado1 = sc.nextDouble();

     System.out.println("Digite o número do segundo lado: ");
     double lado2 = sc.nextDouble();

     System.out.println("Digite o número do terceiro lado: ");
     double lado3 = sc.nextDouble();

         if (lado1 == lado2 && lado2 == lado3) {
         System.out.println("Os lados equivalem à de um Triângulo Equilátero");

         } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
         System.out.println("Os lados equivalem à de um Triângulo Isósceles");

         } else {
         System.out.println("Os lados equivalem à de um Triângulo Escaleno");

         }
        sc.close();
}
}