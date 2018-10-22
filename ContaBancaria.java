
public  class ContaBancaria extends Aplicacao {

	private double saldo;
	private String conta;
	/**
	 * Construtor
	 * @param conta
	 */
	public ContaBancaria(String conta) {
		this.conta = conta;
	}
	
	/**
	 * Metodo Para Transferir dinheiro com Suas Validações
	 * @param contaOrigem
	 * @param contaDestino
	 * @param valor
	 * @throws SaldoInsuficienteException
	 * @throws ValorInvalidoException
	 */
	public void transferir(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) throws SaldoInsuficienteException, ValorInvalidoException {
		//se o valor do saque for maior que o saldo vai gerar uma exception do tipo SaldoInsuficiente
		if(valor > saldo) {
			throw new SaldoInsuficienteException(""+ valor, saldo);
		}
		//Se o valor for negativo ou zero vai gerar uma exception do tipo ValorInvalido
		if(valor <= 0) {
			throw new ValorInvalidoException("", valor);
		}
		else {
			contaDestino.setSaldo(valor);
			saldo -= valor;
			System.out.println("Vc Transferiu " + valor + " de sua conta para a conta: " + contaDestino.getConta() + " seu saldo é de :" + saldo);
		}

	}
	
	/**
	 * Metodo Para Saque com Suas Validações
	 * @param valor
	 * @throws SaldoInsuficienteException
	 * @throws ValorInvalidoException
	 */
	public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
		//se o valor do saque for maior que o saldo vai gerar uma exception do tipo SaldoInsuficiente
		if(valor > saldo) {
			throw new SaldoInsuficienteException(""+ valor, saldo);
		}
		//Se o valor for negativo ou zero vai gerar uma exception do tipo ValorInvalido
		if(valor <= 0) {
			throw new ValorInvalidoException("", saldo);
		}
		else {
			saldo -= valor;
			System.out.println("Vc sacou o valor de " + valor + " com sucesso! Seu saldo é de " + saldo);
		}
	}	
	/**
	 * Metodo Para Depositar e Suas Validações
	 * @param valor
	 * @throws ValorInvalidoException
	 * @throws SaldoInsuficienteException
	 */
	public void depositar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
		//Se o valor for negativo ou zero vai gerar uma exception do tipo ValorInvalido
		if(valor <= 0) {
			throw new ValorInvalidoException("Valor negativo ou zero! o valor que vc tentou depositar foi de : ", + valor);
		}else {
			saldo += valor;
			System.out.println("Vc depositou o valor de " + valor + " com sucesso! Seu saldo é de " + saldo);
		}

	}
	
	/**
	 * Metodos Getters e Setters
	 * @return
	 */
	public String getConta() {
		return conta;
	}
	
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
