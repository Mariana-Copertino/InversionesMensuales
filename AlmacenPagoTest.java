package inversionesMensuales;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlmacenPagoTest {

	@Test
	public void inversionPorAnio1test() {
		Double[] esperado1 = { 1268.2418, 1608.4372, 2039.8873, 2587.0704 };
		assertArrayEquals(esperado1, AlmacenPago.inversionPorAnio(1000, 0.24, 4));
	}

	@Test
	public void inversionPorAnio2test() {
		Double[] esperado2 = { 2000.0, 4000.0001, 8000.0002, 16000.0005, 32000.0012 };
		assertArrayEquals(esperado2, AlmacenPago.inversionPorAnio(1000, 0.71355714, 5));
	}

	@Test(expected = Error.class)
	public void inversionPorAnioValorIncorrecto1test() {
		AlmacenPago.inversionPorAnio(-100, 0.71355714, 5);
	}

	@Test(expected = Error.class)
	public void inversionPorAnioValorIncorrecto2test() {
		AlmacenPago.inversionPorAnio(100, -0.71355714, 5);
	}

	@Test(expected = Error.class)
	public void inversionPorAnioValorIncorrecto3test() {
		AlmacenPago.inversionPorAnio(200, 0.71355714, 0);
	}

	@Test(expected = Error.class)
	public void inversionPorAnioValorIncorrecto4test() {
		AlmacenPago.inversionPorAnio(-100, -0.71355714, 0);
	}

	@Test
	public void MesesDeInversion1test() {
		assertEquals(120, AlmacenPago.MesesDeInversion(1000, 0.07, 2000));
	}

	@Test
	public void MesesDeInversion2test() {
		assertEquals(48, AlmacenPago.MesesDeInversion(1000, 0.24, 2587));
	}

	@Test(expected = Error.class)
	public void MesesDeInversion2ValorIncorrecto1test() {
		AlmacenPago.MesesDeInversion(-1000, 0.07, 2000);
	}

	@Test(expected = Error.class)
	public void MesesDeInversion2ValorIncorrecto2test() {
		AlmacenPago.MesesDeInversion(7000, -0.07, 2000);
	}

	@Test(expected = Error.class)
	public void MesesDeInversion2ValorIncorrecto3test() {
		AlmacenPago.MesesDeInversion(7000, 0.07, -2000);
	}

	@Test(expected = Error.class)
	public void MesesDeInversion2ValorIncorrecto4test() {
		AlmacenPago.MesesDeInversion(0, 0, 0);
	}
}
