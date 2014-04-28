import org.junit.Assert;
import org.junit.Test;

public class AzucarTest {
	@Test
	public void testGetCantidad() {
		int cantidad = 3;
		Azucar azucar = new Azucar(cantidad);
		Assert.assertEquals(cantidad, azucar.getCantidad());
	}
}
