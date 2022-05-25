import java.util.Scanner;

/*
  Faça um programa que peça N números inteiros,
  calcule e mostre a quantidade de números pares
  e números impares.
*/
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		System.out.println(" Quantidade de números:");
		quantNumeros = ler.nextInt();

		int count = 0;
		
		do {
			System.out.println("Número: ");
			numero = ler.nextInt();

			if (numero % 2 == 0) {
				quantPares++;
			} else {
				quantImpares++;
			}

			count++;

		} while (count < quantNumeros);
		
		System.out.println("Quantidade de par: " + quantPares);
		System.out.println("Quantidade de impares: " + quantImpares);

		ler.close();
	}

}
