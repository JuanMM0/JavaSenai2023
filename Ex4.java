 package Atividade; //Puxar da pastinha da atividade//

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) { //ajuste de sistema dado pelo próprio vscode pq o scanner tava bugand//

         System.out.print("Digite o número do mês (1 a 12): ");
          int mes = scanner.nextInt();
         int dias = 0;

             if (mes == 2) {
                dias = 28;
             } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
             } else {
                dias = 31;
             }
             System.out.println("O mês " + mes + " tem " + dias + " dias.");
        }
    }
}
