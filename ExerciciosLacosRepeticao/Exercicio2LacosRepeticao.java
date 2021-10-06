package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio2LacosRepeticao {

	public static void main(String[] args) {
		
		int x,numero,somapar=0,somaimpar=0;

		try (Scanner ler = new Scanner(System.in)) 

		{
			for(x=1;x<10;x++)
			{
				System.out.println("Digite um número: ");
				numero = ler.nextInt();

					if(numero%2==0)
					{
						somapar++;
					}
					else
					{
						somaimpar++;
					}	
			}

			System.out.println("\nNesta condição temos "+ somapar +" pares e " + somaimpar +" impares...");
		}

	}
}
