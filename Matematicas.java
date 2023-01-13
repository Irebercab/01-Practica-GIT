import java.util.Scanner;

public class Matematicas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero % 2 == 0)
			System.out.println("El número es par");
		else
			System.out.println("El número es impar");


		boolean esDivisiblePorTres =
				Matematicas.esDivisiblePorTres(numero);
		if (esDivisiblePorTres)
			System.out.println("El número introducido es divisible entre tres");
		else
			System.out.println("El número introducido no es divisible entre tres");


		boolean esDivisiblePorCinco =
				Matematicas.esDivisiblePorCinco(numero);

		if (esDivisiblePorCinco)
			System.out.println("El número introducido es divisible entre cinco");
		else
			System.out.println("El número introducido no es divisible entre cinco");

	}
}