import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class MaquinaDeCafeTests {

	@Test
	public void testHacerCafe() {
		int cantidadCafe = 100;
		int cantidadAzucar = 2;
		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe();

		Vaso vaso = maquinaDeCafe.hacerCafe(cantidadAzucar, cantidadCafe);
		
		Assume.assumeNotNull(vaso);
		Assume.assumeNotNull(vaso.obtenerCafe());
		
		Assert.assertEquals(cantidadCafe, vaso.obtenerCafe().getCantidad());
		Assert.assertEquals(cantidadAzucar, vaso.obtenerAzucar().getCantidad());
		
	}

	@Test
	public void testHacerBebidaConAzucar() {
		int cantidadAzucar = 2;
		int cantidadBebida = 100;
		MaquinaDeCafe maquinaDeCafe = new MaquinaDeCafe();
		
		Vaso vaso = maquinaDeCafe.hacerCafe(cantidadAzucar, cantidadBebida);
		
		Assume.assumeNotNull(vaso);
		Assert.assertNotNull(vaso.obtenerAzucar());
	}
}
