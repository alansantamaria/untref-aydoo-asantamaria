package untref.aydoo.graficador;

public class FuncionCuadratica {

	private float a;
	private float b;
	private float c;
	private float x;
	private float resultado;

	public FuncionCuadratica(float a, float b, float c){
		this.a = a;
		this.b = b;
		this.c = c;

	}
	public float evaluarEn(float x){
		this.x = x;
		return  = (a*(x*x)) + (b * x) + c;
	}
}