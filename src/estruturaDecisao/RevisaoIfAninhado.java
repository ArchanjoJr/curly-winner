package estruturaDecisao;
import java.util.Scanner;

public class RevisaoIfAninhado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o Primeiro Numero");
		int n1 = input.nextInt();
		System.out.println("Digite o Segundo Numero");
		int n2 = input.nextInt();
		if (n1 > n2) {
			System.out.println("N1 MAIOR QUE N2");
		}else if (n1 < n2) {
			System.out.println("N2 MAIOR QUE N1");
		}
		if (n1 == n2) {
			System.out.println("N1 IGUAL A N2");
		}else if (n1 != n2) {
			System.out.println("N1 DIFERENTE DE N2");
		}

	}

}
