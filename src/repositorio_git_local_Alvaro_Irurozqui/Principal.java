package repositorio_git_local_Alvaro_Irurozqui;
import java.util.Scanner;
public class Principal {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Operacion operacion1 = new Operacion(0, 0);
		int opcionMenu = -1;
		System.out.println("---Introduce el valor del primer numero---");
		operacion1.setA(teclado.nextDouble());
		System.out.println("---Introduce el valor del segundo numero---");
		operacion1.setB(teclado.nextDouble());
		System.out.println("---Selecciona la operacion---");
		System.out.println("1-Sumar");
		System.out.println("2-Restar");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		System.out.println("5-Potenciacion");
		opcionMenu = teclado.nextInt();
		while(opcionMenu != -2) {
			switch (opcionMenu) {
			case 1:
				sumar(operacion1);
				break;
			case 2:
				restar(operacion1);
				break;
			case 3:
				multiplicar(operacion1);
				break;
			case 4:
				dividir(operacion1);
				break;
			case 5:
				potenciacion(operacion1);
				break;
			}
			System.out.println("---Selecciona la operacion---");
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Multiplicar");
			System.out.println("4-Dividir");
			System.out.println("5-Potenciacion");
			opcionMenu = teclado.nextInt();
		}
		teclado.close();
	}
	public static void sumar(Operacion operacion1) {
		double resultado;
		resultado = operacion1.getA() + operacion1.getB();
		System.out.println(resultado);
	}
	public static void restar(Operacion operacion1) {
		double restar;
		restar = operacion1.getA() + operacion1.getB();
		System.out.println(restar);
	}
	public static void multiplicar(Operacion operacion1) {
		double multiplicacion;
		multiplicacion = operacion1.getA() + operacion1.getB();
		System.out.println(multiplicacion);
	}
	public static void dividir(Operacion operacion1) {
		double division;
		division = operacion1.getA() + operacion1.getB();
		System.out.print(division);;
	}
	public static void potenciacion(Operacion operacion1) {
		double potencia;
		potencia = operacion1.getA()*operacion1.getA() + operacion1.getB()*operacion1.getB();
		System.out.println(potencia);
	}
}