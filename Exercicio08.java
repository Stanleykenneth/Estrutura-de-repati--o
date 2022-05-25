import java.util.Scanner;

/*
  Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes froma lidas.
  imprima as consoantes. 
*/
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String[] consoantes = new String[6];
		int quantidadeConsoantes = 0;

		int count = 0;

		do {
			System.out.println(" Letra: ");
			String letra = ler.next();

			if (!(letra.equalsIgnoreCase("a") || 
					letra.equalsIgnoreCase("e") || 
					letra.equalsIgnoreCase("i") ||
					letra.equalsIgnoreCase("o") ||
					letra.equalsIgnoreCase("u"))) {
				
				consoantes[count] = letra;
				quantidadeConsoantes++;
			}
			
			count++;

		} while (count < consoantes.length);
		
		System.out.println("Consoantes: ");
		for (String consoante : consoantes) {
			if(consoante != null) {
				System.out.print(consoante  + " ");
			}				
		}
		
		System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
		System.out.println(consoantes.length);
		ler.close();
	}
}
