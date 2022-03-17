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
		while(opcionMenu != -2) {
			if(opcionMenu == 1) {
				sumar(operacion1);
			}else if(opcionMenu == 2){
				restar(operacion1);
			}else if(opcionMenu == 3) {
				multiplicar(operacion1);
			}else if(opcionMenu == 4) {
				dividir(operacion1);
			}
		}
		teclado.close();
	}
	public static double sumar(Operacion operacion1) {
		double sumar;
		sumar = operacion1.getA() + operacion1.getB();
		return sumar;
	}
	public static double restar(Operacion operacion1) {
		double restar;
		restar = operacion1.getA() + operacion1.getB();
		return restar;
	}
	public static double multiplicar(Operacion operacion1) {
		double multiplicacion;
		multiplicacion = operacion1.getA() + operacion1.getB();
		return multiplicacion;
	}
	public static double dividir(Operacion operacion1) {
		double division;
		division = operacion1.getA() + operacion1.getB();
		return division;
	}
}