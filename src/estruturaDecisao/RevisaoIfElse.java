package estruturaDecisao;

import java.util.Scanner;

public class RevisaoIfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		System.out.println("Digite o primeiro Numero");
		n1 = input.nextInt();
		System.out.println("Digite o Segundo Numero");
		n2 = input.nextInt();
		if (n1 > n2) {
			System.out.println("N1 MAIOR QUE N2");
		}
		if (n2 > n1) {
			System.out.println("N2 MAIOR QUE N1");
		}
		if (n1 == n2) {
			System.out.println("N1 E N2 SAO IGUAIS");
		}
		if (n1 != n2) {
			System.out.println("N1 E N2 SAO DIFERENTE");
		}
	}

}