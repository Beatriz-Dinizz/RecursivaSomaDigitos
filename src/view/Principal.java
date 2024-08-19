package view;

import controller.SomaDigitos;

public class Principal {

	public static void main(String[] args) {
		int n = 189;
		
		int resultado = SomaDigitos.somarDigitos(n);
		System.out.println("A soma dos dígitos do número " + n + " é: " + resultado);
	}
}
