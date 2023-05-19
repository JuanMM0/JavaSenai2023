package Atividade; //Puxar da pastinha da atividade//

import java.util.Scanner; 

     public class Ex5 {
     public static void main(String[] args) {

     try (Scanner scanner = new Scanner(System.in)) { //ajuste de sistema dado pelo próprio vscode pq o scanner tava bugand//

         System.out.print("Digite a idade da primeira pessoa: "); //id = idade//
         int id1 = scanner.nextInt();
         
         System.out.print("Digite a idade da segunda pessoa: ");
         int id2 = scanner.nextInt();
    
         if (id1 > id2) {

         System.out.println("A primeira pessoa é mais velha.");
    }
}
}
}
