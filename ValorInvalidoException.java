
@SuppressWarnings("serial")
public class ValorInvalidoException extends Exception {

	/**
	 * Metodo para Lancar uma Exceção de um Valor Invalido
	 */
	private double valorInvalido;
	
	public ValorInvalidoException(String message, double valorInvalido) {
		super(message);
		this.valorInvalido = valorInvalido;
	}
	
	/**
	 * Metodo Get
	 * @return valorInvalido
	 */
	
	public double getvalorInvalido() {
		return valorInvalido;
	}
	
}
