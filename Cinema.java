import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        boolean cont = true; //cont = continuar//
        int opc; //opc = opção//
        int resp; //resp = opção//
        Scanner sc = new Scanner (System.in);

        do {
            System.out.println("***Menu de opções do Cinema POP**\n");
            System.out.println("1- Listar salas \n");
            System.out.println("0- Sair do Menu\n");

            System.out.println("Digite a opção desejada:\n ");
            opc = sc.nextInt();

            if(opc==0){
                System.out.println("Programa encerrado.\n");
                cont=false;
            
            }
            if(opc==1){
                System.out.println("Sala 1\n");
                System.out.println("Sala 2\n");
                System.out.println("Sala 3\n");
                cont=false;
                System.out.println("Qual sala você deseja? Digite o número correspondente a sala.\n");
                
                resp= sc.nextInt();
                if(resp==1){
                    System.out.println("Bem vindo a sala 1\n");


                    cont=false;
                }
                if(resp==2){
                    System.out.println("Bem vindo a sala 2\n");

                    cont=false;
                }
                if(resp==3){
                    System.out.println("Bem vindo a sala 3\n");

                    cont=false;
                
                }
            }
        }
        while(cont);
    }
}


