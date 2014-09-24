import java.util.Scanner;

public class Circulo {

	public static void main(String args[]) {

		double radio, area, circun;
		OperacionesCirculo operaciones = new OperacionesCirculo();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce el radio de un circulo: ");
		radio = sc.nextInt();

		area = operaciones.are(radio);
		circun = operaciones.cir(radio);

		System.out.println("\nEl area del circulo es: " + area);
		System.out.println("\nLa circunferencia del circulo es: " + circun);
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
