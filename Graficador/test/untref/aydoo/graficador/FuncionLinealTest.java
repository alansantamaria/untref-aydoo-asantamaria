package untref.aydoo.graficador.test;

import org.junit.Assert;
import org.junit.Test;
import untref.aydoo.graficador.FuncionLineal;

public class FuncionLinealTest {

	@Test
	public void evaluarEn4DeberiaRetornar11CuandoAEs2YBEs3() {

		float a = 3.0f;
		float b = 6.0f;
		float x = 9.0f;
		float resultado = 33.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

	}


	@Test
	public void evaluarEn0DeberiaRetornar6CuandoAEs3YBEs6() {

		float a = 3.0f;
		float b = 6.0f;
		float x = 0.0f;
		float resultado = 6.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.001);

	}
	@Test
	public void evaluarEnMenos4DeberiaRetornar11CuandoAEs2YBEs3() {

		float a = 2.0f;
		float b = 3.0f;
		float x = -4.0f;
		float resultado = -5.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.001);

	}
	@Test
	public void evaluarEn4DeberiaRetornarCuandoAEs0YBEsMenos3() {

		float a = 0.0f;
		float b = -3.0f;
		float x = 4.0f;
		float resultado = -3.0f;

		FuncionLineal funcionLineal = new FuncionLineal(a, b);

		Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.001);

	}


}