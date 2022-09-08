package Atividade1;

import java.util.Scanner;

public class FourthQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("INSERIR NOME DOS ALUNOS ABAIXO : ");
		String aluno[] = new String[20];
		aluno[0] = sc.next();
		aluno[1] = sc.next();
		aluno[2] = sc.next();
		aluno[3] = sc.next();
		aluno[4] = sc.next();
		aluno[5] = sc.next();
		aluno[6] = sc.next();
		aluno[7] = sc.next();
		aluno[8] = sc.next();
		aluno[9] = sc.next();
		aluno[10] = sc.next();
		aluno[11] = sc.next();
		aluno[12] = sc.next();
		aluno[13] = sc.next();
		aluno[14] = sc.next();
		aluno[15] = sc.next();
		aluno[16] = sc.next();
		aluno[17] = sc.next();
		aluno[18] = sc.next();
		aluno[19] = sc.next();

		System.out.println("INSERIR TODAS AS PRIMEIRAS NOTAS : ");
		double n1[] = new double[20];
		n1[0] = sc.nextDouble();
		n1[1] = sc.nextDouble();
		n1[2] = sc.nextDouble();
		n1[3] = sc.nextDouble();
		n1[4] = sc.nextDouble();
		n1[5] = sc.nextDouble();
		n1[6] = sc.nextDouble();
		n1[7] = sc.nextDouble();
		n1[8] = sc.nextDouble();
		n1[9] = sc.nextDouble();
		n1[10] = sc.nextDouble();
		n1[11] = sc.nextDouble();
		n1[12] = sc.nextDouble();
		n1[13] = sc.nextDouble();
		n1[14] = sc.nextDouble();
		n1[15] = sc.nextDouble();
		n1[16] = sc.nextDouble();
		n1[17] = sc.nextDouble();
		n1[18] = sc.nextDouble();
		n1[19] = sc.nextDouble();

		System.out.println("INSERIR TODAS AS SEGUNDAS NOTAS : ");
		double n2[] = new double[20];

		n2[0] = sc.nextDouble();
		n2[1] = sc.nextDouble();
		n2[2] = sc.nextDouble();
		n2[3] = sc.nextDouble();
		n2[4] = sc.nextDouble();
		n2[5] = sc.nextDouble();
		n2[6] = sc.nextDouble();
		n2[7] = sc.nextDouble();
		n2[8] = sc.nextDouble();
		n2[9] = sc.nextDouble();
		n2[10] = sc.nextDouble();
		n2[11] = sc.nextDouble();
		n2[12] = sc.nextDouble();
		n2[13] = sc.nextDouble();
		n2[14] = sc.nextDouble();
		n2[15] = sc.nextDouble();
		n2[16] = sc.nextDouble();
		n2[17] = sc.nextDouble();
		n2[18] = sc.nextDouble();
		n2[19] = sc.nextDouble();

		double media[] = new double[20];

		for (int i = 0; i < aluno.length; i++) {

			media[i] = ((n1[i] * 2 + n2[i] * 3)) / 5;

			if (media[i] >= 7) {
				System.out.println(aluno[i] + " FOI APROVADO COM MEDIA = " + media[i]);

			} else {
				System.out.println(aluno[i] + " FOI REPROVADO COM MEDIA = " + media[i]);
			}

		}
		

	}
}
