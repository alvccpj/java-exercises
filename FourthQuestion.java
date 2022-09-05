package Atividade1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FourthQuestion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nomes[] = new String[20];
		double primeirasNotas[] = new double[20];
		double segundasNotas[] = new double[20];
		double medias[] = new double[20];
		boolean vet[] = new boolean[20];
		
		List<String> listaDeNomes = new ArrayList<>();
		

		for (int i = 0; i < 20; i++) {
			System.out.println("Informe o nome do aluno: ");
			nomes[i] = in.next();
			System.out.println("Informe a primeira nota: ");
			primeirasNotas[i] = in.nextDouble();
			System.out.println("Informe a segunda nota: ");
			segundasNotas[i] = in.nextDouble();
			
			medias[i] = (primeirasNotas[i] * 2 + segundasNotas[i] * 3)/5;
			
			if (medias[i] >= 7) {
				vet[i] = true;
			} else {
				vet[i] = false;
			}
			System.out.println("Lista de nomes: " +listaDeNomes.get(i));
		}
	}

}
