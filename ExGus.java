public class ExGus {
     public static void main(String[] args) {
         for (int i = 1; i <= 100; i++) {
         System.out.print(i + ": ");
    
         if (i % 2 == 0) {
         System.out.print("Par. ");

        } else {
         System.out.print("Ímpar. ");
        }
    
         if (i % 3 == 0) {
         System.out.print("Múltiplo de 3. ");
        } else{
            System.out.println("Não é multiplo de 3. ");
        }
    
         if (i % 4 == 0) {
         System.out.print("Múltiplo de 4. ");
        } else {
            System.out.println("Não é multiplo de 4. ");
        }
    
         if (i % 5 == 0) {
         System.out.print("Múltiplo de 5. ");
        } else {
            System.out.println("Não é multiplo de 5. ");
        }
    
         System.out.println();

        } 

    }

}