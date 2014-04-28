package untref.aydoo.graficador.test;

import org.junit.Assert;
import org.junit.Test;

import untref.aydoo.graficador.FuncionCuadratica;

public class FuncionCuadraticaTest {

	@Test
	public void evaluarEn(){

		float a = 3.0f;
		float b = 6.0f;
		float c = 9.0f;
		float x = 12.0f;
		float resultado = 909.0f;


		FuncionCuadratica funcionCuadratica = new FuncionCuadratica(a,b,c);
		Assert.assertEquals(resultado, funcionCuadratica.evaluarEn(x), 0.00001);

	}

}