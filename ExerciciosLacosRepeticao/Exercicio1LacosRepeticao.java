package ExerciciosLacosRepeticao;

public class Exercicio1LacosRepeticao {

	public static void main(String[] args) {
		
		double x,divisao;

        for(x=1000;x<=1999;x++)
        {
            divisao = x/11;

                if (x%11==5)
                {
                    System.out.println("O n�mero " + x + " dividido por 11 tem como resto da divis�o o valor 5...");
                }
        }
    }
}