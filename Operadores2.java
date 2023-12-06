package aula01;

public class Operadores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1=23, numero2=45, numero3=23;
		System.out.println(numero1 < numero2);
		System.out.println(numero1 > numero2);
		System.out.println(numero1==numero3);
		System.out.println(numero1<=numero3);
		System.out.println(numero1>=numero2);
		System.out.println(numero1!=numero2);
		System.out.println(numero1!=numero3);
		
		
		System.out.println("***********************************************");
		
		System.out.println(!true);
		System.out.println(!false);
		
		boolean confirma1 = true;
		boolean confirma2 = false;
		boolean confirma3 = true;
		//operador &&
		System.out.println(confirma1 && confirma2);
		System.out.println(confirma1 && confirma3);
		
		int valorx = 7, valory = 10;
		
		System.out.println(valorx != valory && valorx<valory);
		System.out.println(valorx == valory && valorx<valory);
		
		System.out.println(valorx == valory || valorx<valory);
		System.out.println(valorx==valory || valorx>valory);
		
		
	}

}
