package calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exec = true;
        while (exec) {
            System.out.println("Calculadora Basica de dois Numeros");
            System.out.println("DIGITE A SUA OPÇÃO");
            System.out.println("1- PARA SOMAR");
            System.out.println("2- PARA SUBTRAIR");
            System.out.println("3- PARA MULTIPLICAÇÃO");
            System.out.println("4- PARA DIVISÃO");
            System.out.println("5- PARA SAIR");
            int op = input.nextInt();
            if (op == 1) {
                System.out.println("DIGITE O PRIMEIRO NUMERO");
                int n1 = input.nextInt();
                System.out.println("DIGITE O SEGUNDO NUMERO");
                int n2 = input.nextInt();
                System.out.printf("O RESULTADO DA SOME É : %d\n", n1 + n2);
            } else if (op == 2) {
                System.out.println("DIGITE O PRIMEIRO NUMERO");
                int n1 = input.nextInt();
                System.out.println("DIGITE O SEGUNDO NUMERO");
                int n2 = input.nextInt();
                System.out.printf("O RESULTADO DA SUBTRAÇÃO É : %d\n", n1 - n2);
            } else if (op == 3) {
                System.out.println("DIGITE O PRIMEIRO NUMERO");
                int n1 = input.nextInt();
                System.out.println("DIGITE O SEGUNDO NUMERO");
                int n2 = input.nextInt();
                System.out.printf("O RESULTADO DA MULTIPLICAÇÃO É : %d\n", n1 * n2);
            } else if (op == 4) {
                System.out.println("DIGITE O PRIMEIRO NUMERO");
                int n1 = input.nextInt();
                System.out.println("DIGITE O SEGUNDO NUMERO");
                int n2 = input.nextInt();
                System.out.printf("O RESULTADO DA DIVISÃO É : %d\n", n1 / n2);
            } else if (op == 5) {
                exec = false;
            }
        }
    }
}
