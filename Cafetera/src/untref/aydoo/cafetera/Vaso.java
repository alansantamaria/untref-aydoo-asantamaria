
public class Vaso {
	
	private Cafe cafe;
	private Azucar azucar;
	
	public void servir(Cafe cafe){
		this.cafe = cafe;
	}
	
	public void ponerAzucar(Azucar azucar){
		this.azucar = azucar;
	}
	
	public Azucar obtenerAzucar() {
		return azucar;
	}
	
	public Cafe obtenerCafe(){
		return cafe;
	}

}