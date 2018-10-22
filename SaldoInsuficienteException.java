
@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {
	
	/**
	 * Metodo para Lancar uma Exception para Saldo Insuficiente
	 */
	private double valor;
	
	public SaldoInsuficienteException(String message, double valor) {
		super(message);
		this.valor = valor;
	}
	
	/**
	 * Metodo Get
	 * @return valor
	 */
	public double getValor() {
		return valor;
}
}
