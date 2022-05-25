import java.util.Scanner;

/*
  Faça um programa que leia 5 números e informe o maior
  e a média desses números.
*/
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 
		int numero;
		int count = 0;
		int soma = 0;		
		int maior = 0;
		
		
		do {
			System.out.println("Número: ");
			numero = ler.nextInt();	
			
			soma = soma + numero;
			
			
			if(numero > maior) maior = numero;
			
			count = count + 1;
		} while (count < 5);
		
		ler.close();
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + (soma / 5));
	}

}

