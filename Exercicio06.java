import java.util.Scanner;

/*
  Faça um programa que clacule o fatorial de um número inteiro fornecido pelo usuário.
  Ex: 5! = 120
*/
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int fatorial;

		System.out.println("Fatorial: ");
		fatorial = ler.nextInt();

		int multiplicacao = 1;

		System.out.print(fatorial + "!= ");
		
		for (int i = fatorial; i >= 1; i--) {
			
			multiplicacao = multiplicacao * i;
		}

		System.out.println(multiplicacao);
		ler.close();

	}

}
