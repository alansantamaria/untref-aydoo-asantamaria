import org.junit.Assert;
import org.junit.Test;

public class CafeTest {
	
	@Test
	public void testGetCantidad() {
		int cantidad = 100;
		Cafe cafe = new Cafe(100);
		Assert.assertEquals(cantidad, cafe.getCantidad());
	}
}
