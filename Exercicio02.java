import java.util.Scanner;

/*
  Faça um programa que peça uma nota, entre zero e dez.
  Mostre uma mensagen caso o valor seja inválido
  e continue pedindo
  até que o usuário informe uma valor válido.
*/
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = ler.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inválida!\nDigite novamente: ");
			nota = ler.nextInt();
		}
		
		ler.close();

	}

}
