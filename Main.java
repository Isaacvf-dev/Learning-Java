package curso_java;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		x = sc.nextDouble();
		System.out.printf("Voce digitou: %.2f%n", x);
		
		Locale.setDefault(Locale.US);
		System.out.println("Voce digitou: " + x);
		
		
		sc.close();
	}

}
