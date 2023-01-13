import java.util.Scanner;

public class Matematicas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero % 2 == 0)
			System.out.println("El número es par");
		else
			System.out.println("El número es impar");
	}

	public static boolean esPar(int numero) {
		if (numero % 2 == 0) return true;
		else return false;
	}


	public static boolean esDivisiblePorTres(int numero) {
		if (numero % 3 == 0)
			return true;
		return false;
	}

	public static boolean esDivisiblePorCinco(int numero) {
		if (numero % 5 == 0)
			return true;
		return false;
	}
}