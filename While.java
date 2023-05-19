    import java.util.Scanner;
    
    public class While {
    

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
            System.out.println("5 - SEM paquerar na aula\n");   
            System.out.println("6 - Ouvir o tio Egard\n" );  
            System.out.println("7 - Nâo usar o insta\n ");                  
            System.out.println("0 - Sair do Menu\n");


            System.out.println("Digite a opção desejada");        
            opc = sc.nextInt();

            if(opc==0){   
                continuar=false;
                System.out.println("Programa encerrado");
            }         
                
            if (opc==1){            
            System.out.println("1- Prestar atenção na aula\n");
            continuar=false;
            System.out.println("Você deseja continuar?");
            System.out.println("Digite 1 para continuar ou 2 para encerrar");
            resp=sc.nextInt();
            if(resp==1){
            continuar=true;
            }
            }
            if (opc==2){            
            System.out.println("2- Fazer todos os exercicios\n");
            continuar=false;
            System.out.println("Você deseja continuar?");
            System.out.println("Digite 1 para continuar ou 2 para encerrar");
            resp=sc.nextInt();
            if(resp==1){
            continuar=true;
                }
                }
            if (opc==3){            
            System.out.println("3- NÃO falar palavrão \n");
            continuar=false;
            System.out.println("Você deseja continuar?");
            System.out.println("Digite 1 para continuar ou 2 para encerrar");
            resp=sc.nextInt();
            if(resp==1){
            continuar=true;  
            }
            }  
            if (opc==4){            
            System.out.println("4 - NÃO dormir na aula\n");
            continuar=false;
            System.out.println("Você deseja continuar?");
            System.out.println("Digite 1 para continuar ou 2 para encerrar");
            resp=sc.nextInt();
            if(resp==1){
            continuar=true;  
                }
                } 
            if (opc==5){            
            System.out.println("5 - SEM paquerar na aula\n");
            continuar=false;
            System.out.println("Você deseja continuar?");
            System.out.println("Digite 1 para continuar ou 2 para encerrar");
            resp=sc.nextInt();
            if(resp==1){
            continuar=true;  
                        }
                        } 
            if (opc==6){            
            System.out.println("6 - Ouvir o tio Egard\n");
            continuar=false;
            System.out.println("Você deseja continuar?");
            System.out.println("Digite 1 para continuar ou 2 para encerrar");
            resp=sc.nextInt();
            if(resp==1){
            continuar=true;  
                                        }
                                        } 
            if (opc==7){             
            System.out.println("7 - Nâo usar o insta\n ");
            continuar=false;
            System.out.println("Você deseja continuar?");
            System.out.println("Digite 1 para continuar ou 2 para encerrar");
            resp=sc.nextInt();
            if(resp==1){
            continuar=true;  
                                                                        }
                                                                        } 
        
        



        }
        while (continuar);

       }     
    }

