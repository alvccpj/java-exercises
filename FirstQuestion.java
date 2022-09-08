package Atividade1;

public class FirstQuestion {

	public static void main(String[] args) {

		char vet[] = new char[10];
		char aux;

		vet[0] = 'T';
		vet[1] = 'R';
		vet[2] = 'X';
		vet[3] = 'S';
		vet[4] = ' ';
		vet[5] = 'E';
		vet[6] = 'O';
		vet[7] = 'B';
		vet[8] = 'A';
		vet[9] = '!';

		aux = vet[5];
		vet[5] = vet[8];
		vet[8] = aux;

		for (int j = 0; j <= 3; j++) {
			aux = vet[j];
			vet[j] = vet[7 - j];
			vet[7 - j] = aux;
			System.out.println("Valor do vet[] = " + vet[j]);
			System.out.println("Valor do vet[7-j] = " + vet[7 - j]);
			System.out.println("Valor do aux = " + aux);
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}

	}

}
