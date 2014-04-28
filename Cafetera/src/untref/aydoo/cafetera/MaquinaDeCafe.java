
public class MaquinaDeCafe {

	public Vaso hacerCafe(int cantidadAzucar, int cantidadCafe) {
		Cafetera cafetera = new Cafetera();
		Vaso vaso = new Vaso();
		Azucar azucar = new Azucar(cantidadAzucar);
		vaso.ponerAzucar(azucar);
		vaso.servir(cafetera.dameCafe(cantidadCafe));
		return vaso;
	}

}
