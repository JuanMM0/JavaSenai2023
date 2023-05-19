import java.util.Scanner;

public class Exed2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int op = 0;

while (op != 3) {
exibirMenu();
op = sc.nextInt();

switch (op) {
case 1:
calcularAreaQuadrado(sc);
break;
case 2:
calcularAreaQuadrado(sc);
break;
case 3:
System.out.println("Encerrando o programa...");
break;
default:
System.out.println("Opção inválida! Tente novamente.");
break;
}
}

sc.close();
}

private static void calcularAreaQuadrado(Scanner sc) {
}

private static void exibirMenu() {
System.out.println("Selecione uma figura geométrica:");
System.out.println("1 - Quadrado");
System.out.println("2 - Círculo");
System.out.println("3 - Sair do programa");
System.out.print("Opção: ");
}
}