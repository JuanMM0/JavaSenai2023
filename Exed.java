import java.util.Scanner;

public class Exed {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
    

     System.out.print("Digite uma palavra: ");
     String Opala = sc.nextLine();

         if (verificaOpala(Opala)) {
         System.out.println("A palavra '" + Opala + "' é um palíndromo.");
        } else {
         System.out.println("A palavra '" + Opala + "' não é um palíndromo.");
        }
        

        sc.close();
}

private static boolean verificaOpala(String plv) {
    plv = plv.toLowerCase(); 
    // Transforma todas as letras em minúsculas para não dar nenhum problema

    plv = plv.replace(" ", ""); 
    // Remove espaços em branco para não dar erros, acredite da erro
    
    StringBuilder reverse = new StringBuilder(plv).reverse();
    // O StringBuilder reverte a palavra junto com o reverse
    
    return plv.equals(reverse.toString());
    // Esse código compara se esse palavra ou frase que foi invertida é igual a palavra ou frase inserida no começo
}
}


