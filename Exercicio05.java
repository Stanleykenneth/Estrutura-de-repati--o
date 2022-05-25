import java.util.Scanner;

/*
 Desenvolva um gerador de tabuada,
 capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
 O usuário deve informar que qual número ele deseja ver a tabuada.
 A saída deve ser conforme o exemplo abaixo:
 
 Tabuada de 5:
 
 5 x 1 = 5
 5 x 2 = 10
 ...
 5 x 10 = 50
  
*/

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println(" Digite um número ao qual deseja efetuar uma tabuada: ");
		numero = ler.nextInt();
		
		System.out.println(" Tabuada de " + numero);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
		
		ler.close();
	}

}