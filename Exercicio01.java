
 /*
  Faça um programa que leia conjuntos de dois valores,
  o primeiro representando o nome do aluno e o segundo
  represenyando a sua idade.
  (Para o programa inserindo o vlaor 0 no nome)
 */
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;		
		
		while( true) {
			System.out.println("Nome: ");
			nome = ler.nextLine();
			if(nome.equals("0"))break; 
			
			System.out.println("Idade: ");
			idade = ler.nextInt();
			
		}
		System.out.println(" Continua aqui...");
		ler.close();
	}
	
}
