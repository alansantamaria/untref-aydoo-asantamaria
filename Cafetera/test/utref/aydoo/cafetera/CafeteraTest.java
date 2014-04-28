import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

public class CafeteraTest {
	@Test
	public void testDameCafe() {
		int cantidad = 100;
		Cafetera cafetera = new Cafetera();
		Cafe cafe = cafetera.dameCafe(cantidad);

		Assume.assumeNotNull(cafe);
		Assert.assertEquals(100, cafe.getCantidad());
	}
}
