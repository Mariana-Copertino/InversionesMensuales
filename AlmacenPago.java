package inversionesMensuales;

public class AlmacenPago {

	public static Double[] inversionPorAnio(double montoInvertir, double interesAnual, int cantidadAniosMaximo) {
		validarParametros(montoInvertir, interesAnual, cantidadAniosMaximo);
		Double[] lista = new Double[cantidadAniosMaximo];
		for (int i = 0; i < cantidadAniosMaximo; i++) {
			for (int j = 0; j < 12; j++) {
				montoInvertir += montoInvertir * (interesAnual / 12);
			}
			lista[i] = redondearDecimales(montoInvertir);
		}
		return lista;
	}

	public static int MesesDeInversion(double montoInvertir, double interesAnual, double saldoFinalDeseado) {
		validarParametros(montoInvertir, interesAnual, saldoFinalDeseado);
		int meses = 0;
		while (montoInvertir < saldoFinalDeseado) {
			montoInvertir += montoInvertir * (interesAnual / 12);
			meses++;
		}
		return meses;
	}

	// Método para validar que se ingresen parámetros correctos

	public static void validarParametros(double valor1, double valor2, double valor3) {
		if (valor1 <= 0 || valor2 <= 0 || valor3 <= 0) {
			throw new Error("Los valores ingresados deben ser mayores que 0");
		}
	}

	// Escribí este método para no tener que redondear decimales dentro de
	// inversionPorAnio

	public static Double redondearDecimales(Double numero) {
		return Math.round(numero * 10000) / 10000.0;
	}
}
