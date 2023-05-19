package Atividade; //Puxar da pastinha da atividade//

import java.util.Scanner;

     public class Ex2 {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.print("Digite um número que represente a temperatura em graus Celsius: ");
         double celsius = sc.nextDouble();
         double fahrenheit = (celsius * 9/5) + 32;
         double kelvin = celsius + 273.15;

         System.out.println("Temperatura mudada para graus Fahrenheit: " + fahrenheit);

         System.out.println("Temperatura mudada para graus Kelvin: " + kelvin);

         sc.close();
    }
}