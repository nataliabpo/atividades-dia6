package aula01;

import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		aqui temos comentários de múltiplas linhas
		linha 2 de comentário
		 */
		//variaveis no java
		/*byte n1;
		n1=5;*/
		byte n1 = 5;
		int valor1 = 553;
		float altura = 1.733232f;
		Long codigo = 432434l;
		boolean aceitaProposta = true;
		char letra = 'a';
		int idade = 27;
		String nome = "Lucas";
		
		System.out.print(nome + " tem " + idade+ " anos\n");
		System.out.print(altura);
		System.out.printf("\nA Altura é: %.2f\n", altura);
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o seu nome: \n");
		nome = leia.nextLine();
		System.out.println("O nome do usuário é: " + nome);
		
	}

}
