package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio5LacosRepeticao {

	public static void main(String[] args) {

		int numero,soma=0;

		try (Scanner ler = new Scanner(System.in)) {

			do
			{
				System.out.println("Digite um n�mero que seja inteiro): ");
				numero = ler.nextInt();

					if(numero!=0)
					{
						soma = soma + numero;
					}

			}while(numero>0);

			System.out.println("A soma dos n�meros de sua prefer�ncia �: " + soma);
		}
	}
	}