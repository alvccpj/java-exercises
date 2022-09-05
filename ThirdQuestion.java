package Atividade1;

import java.util.Scanner;

public class ThirdQuestion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double A[] = new double[20];
		double B[] = new double[20];
		double C[] = new double[20];

		for (int i = 0; i < 20; i++) {
			System.out.println("Informe valor do vetor A: ");
			A[i] = in.nextDouble();

			System.out.println("Informe valor do vetor B: ");
			B[i] = in.nextDouble();

			C[i] = A[i] + B[i];
			System.out.println("O valor do vetor C é: " + C[i]);
		}

	}

}
