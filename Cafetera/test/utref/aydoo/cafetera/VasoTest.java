
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class VasoTest {
	@Test
	public void testPonerAzucarAlVaso() {
		int cantidadAzucar = 2;
		Vaso vaso = new Vaso();
		Azucar azucar = new Azucar(cantidadAzucar);
		vaso.ponerAzucar(azucar);
		
		Assume.assumeNotNull(vaso.obtenerAzucar());
		
		Assert.assertEquals(cantidadAzucar, vaso.obtenerAzucar().getCantidad());
	}
	
	@Test
	public void testServir() {
		int cantidad = 100;
		Cafe cafe = new Cafe(cantidad);
		Vaso vaso = new Vaso();
		vaso.servir(cafe);
		
		Assume.assumeNotNull(vaso.obtenerCafe());
		
		Assert.assertEquals(cantidad, vaso.obtenerCafe().getCantidad());
	}

}
