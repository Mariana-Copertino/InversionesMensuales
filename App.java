package inversionesMensuales;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// Usé algunos System.out.println de más solo para estructurar lo que se ve por
		// consola
		System.out.println("Método 1");
		System.out.println("------- EJEMPLO 1 -------");
		System.out.println(Arrays.toString(AlmacenPago.inversionPorAnio(1000, 0.24, 4)));
		System.out.println("------- EJEMPLO 2 -------");
		System.out.println(Arrays.toString(AlmacenPago.inversionPorAnio(1000, 0.71355714, 5)));
		System.out.println("Método 2");
		System.out.println("------- EJEMPLO 1 -------");
		System.out.println(AlmacenPago.MesesDeInversion(1000, 0.07, 2000));
		System.out.println("------- EJEMPLO 2 -------");
		System.out.println(AlmacenPago.MesesDeInversion(1000, 0.24, 2587));

	}

}
