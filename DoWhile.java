import java.util.Scanner;

 

public class DoWhile {

 

    public static void main(String[] args) {
        boolean continuar = true;
        int opc;
        int resp;
        Scanner sc = new Scanner(System.in);

 

        do {

 

            System.out.println("***Menu de opções do Senai***\n");
            System.out.println("1 - Prestar atenção na aula \n");
            System.out.println("2 - Fazer todos os exercícios \n");
            System.out.println("3 - NÃO falar palavrão\n");
            System.out.println("4 - NÃO dormir na aula\n");
            System.out.println("5 - NÃO USAR o insta\n");
            System.out.println("6 - NÃO passar o zap zap para os alunos da sala da frente\n");
            System.out.println("7 - Ouvir os conselhos do tio Edgard\n");
            System.out.println("0 - Sair do Menu\n");

 

            System.out.println("Digite a opção desejada");
            opc = sc.nextInt();

 

            if(opc==0){
                continuar=false;
                System.out.println("POGRAMA ENCERRADÚ MANO!");

 

            }
           
            if(opc==1){
              System.out.println("1 - Prestar atenção na aula");  
              continuar=false;
              System.out.println("Você deseja continuar?");
              System.out.println("Digite 1 para continuar ou 2 para encerrar");
              resp=sc.nextInt();
               if (resp==1) {
                continuar=true;
               } 

            }
            if(opc==2){
                System.out.println("2 - Fazer todos os exercícios\n");  
                continuar=false;
                System.out.println("Você deseja continuar?");
                System.out.println("Digite 1 para continuar ou 2 para encerrar");
                resp=sc.nextInt();
                 if (resp==1) {
                  continuar=true;
                 } 
  
              }
            
              if(opc==3){
                System.out.println("3 - NÃO falar palavrão\n");  
                continuar=false;
                System.out.println("Você deseja continuar?");
                System.out.println("Digite 1 para continuar ou 2 para encerrar");
                resp=sc.nextInt();
                 if (resp==1) {
                  continuar=true;
                 } 
  
              }
              if(opc==4){
                System.out.println("4 - NÃO dormir na aula\n");  
                continuar=false;
                System.out.println("Você deseja continuar?");
                System.out.println("Digite 1 para continuar ou 2 para encerrar");
                resp=sc.nextInt();
                 if (resp==1) {
                  continuar=true;
                 } 
  
              }
              if(opc==5){
                System.out.println("5 - NÃO USAR o insta\n");  
                continuar=false;
                System.out.println("Você deseja continuar?");
                System.out.println("Digite 1 para continuar ou 2 para encerrar");
                resp=sc.nextInt();
                 if (resp==1) {
                  continuar=true;
                 } 
  
              }
              if(opc==6){
                System.out.println("6 - NÃO passar o zap zap para os alunos da sala da frente\n");  
                continuar=false;
                System.out.println("Você deseja continuar?");
                System.out.println("Digite 1 para continuar ou 2 para encerrar");
                resp=sc.nextInt();
                 if (resp==1) {
                  continuar=true;
                 } 
  
              }
              if(opc==7){
                System.out.println("7 - Ouvir os conselhos do tio Edgard\n");  
                continuar=false;
                System.out.println("Você deseja continuar?");
                System.out.println("Digite 1 para continuar ou 2 para encerrar");
                resp=sc.nextInt();
                 if (resp==1) {
                  continuar=true;
                 } 
  
              }

        
        }
        
        while (continuar);

 

 

 

 

    }
    
}