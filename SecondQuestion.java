package Atividade1;

import java.util.Scanner;

public class SecondQuestion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A[] = new int[15];
		int B[] = new int[15];

		for (int i = 0; i <= A.length; i++) {
			System.out.println("Informe o valor: ");
			A[i] = in.nextInt();

			if (A[i] % 2 == 0) {
				B[i] = A[i] / 2;
			} else {
				B[i] = A[i] * 3;
			}

			System.out.println("O valor de A é igual a: " + A[i]);
			System.out.println("O valor de B é igual a: " + B[i]);

		}
	}
}
