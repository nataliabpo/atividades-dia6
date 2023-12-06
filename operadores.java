package aula01;

public class operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*operadores matemáticos
		//-subtração +adição *multiplicação /divisão %módulo
		
		int valor1 = 10, valor2 = 5;
		System.out.println("Valor 1 é igual a 10 e valor 2 é igual a 5\n");
		
		int resultado = valor1 + valor2;
		System.out.println("O valor da soma dos valores é: " +resultado);
		
		resultado = valor1 - valor2;
		System.out.println("O valor da subtração dos valores é: " +resultado);
		
		resultado = valor1 * valor2;
		System.out.println("O valor da multiplicação dos valores é: " +resultado);
		
		resultado = valor1 / valor2;
		System.out.println("O valor da divisão dos valores é: " +resultado);
		
		int numero1 = 9, numero2 = 2;
		resultado = numero1%numero2;
		System.out.println(resultado);

		String nome = "Lucas";
		String nomeCompleto = nome + " Camargo";
		System.out.println(nomeCompleto);
		
		resultado = (numero1+numero2)*3;
		System.out.println(resultado);
		
		System.out.println("***********************************************");
		
		System.out.println("Autoincremento");
		int x=1;
		//x++;
		x = x+1;
		System.out.println(x);
		
		//System.out.println(x++);
		//System.out.println(x);
		//System.out.println(++x);
		System.out.println("***********************************************");
		
		System.out.println("Decremento");
		int y=5;
		//System.out.println(y--);
		System.out.println(--y);
		
		int n1=3;
		n1+=5;
		//n1 = n1 + 2 
		
		System.out.println(n1);
		
		
		String produto = "Mouse";
		produto += " gamer";
		System.out.println(produto);
		
		System.out.println("***********************************************");
		//operador subtrair e atribuir
		int ano=2023;
		ano -=1;
		
		System.out.println(ano);
		
		double preco = 1543;
		//resultado = preco/2;
		double resultado2 = preco/2;
		System.out.println(resultado2);
		
	}

}
