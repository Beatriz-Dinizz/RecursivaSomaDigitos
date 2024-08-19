package controller;

public class SomaDigitos {

	public SomaDigitos() {
		super();
	}
	
	public static int somarDigitos(int n) {
		// Condição de parada: quando o número é menor que 10, significa que não possui números para serem somados.
		if(n < 10) {
			return n;
		}
		
		// Relação de chamada dos passos: A função soma o dígito menos significativo (n % 10) 
		// ao resultado da soma dos dígitos do número sem o último dígito (n / 10).
		
		return (n % 10) + somarDigitos(n / 10);
	}
}
