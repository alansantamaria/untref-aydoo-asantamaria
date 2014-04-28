package untref.aydoo.graficador;

public class FuncionLineal {

	private float a;
	private float b;
	private float x;
	private float resultado;

	public FuncionLineal(float a, float b) {

		this.a = a;
		this.b = b;

	}

	public float evaluarEn(float x) {
		this.x = x;
		return  (this.a * this.x) + this.b;
	}

}