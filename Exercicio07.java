/*
 Crie um vetor de 6 números interios e mostre-os na ordem inversa.
*/
public class Exercicio07 {

	public static void main(String[] args) {
		
		System.out.println("Vetor: ");
		int [] vetor = {0, -5, 15, 8, 50, 4};
		
		int count = 0;
		while(count < (vetor.length)) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		
		System.out.println("\nVetor: ");
		for(int i = (vetor.length -1); i >= 0; i-- ) {
			System.out.print(vetor[i] + " ");
			
		}
	}

}

