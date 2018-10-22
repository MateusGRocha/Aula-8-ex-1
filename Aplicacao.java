
public class Aplicacao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//Instanciando Novas Contas
		ContaBancaria c2 = new ContaBancaria("02");
		ContaBancaria c1 = new ContaBancaria("01");
		c1.depositar(1000);
		
		System.out.println("-------------------------------");
		
		
		/**
		 * Fazendo Testes Depositando, Transferindo e sacando valores
		 */
		try {
		c1.transferir(c1, c2, 1000);
	//	c2.transferir(c2, c1, 100);
		}catch(SaldoInsuficienteException e) {
			System.out.println("Vc tentou transferir " + e.getMessage() + ", seu saldo é de " + e.getValor());
		}catch(ValorInvalidoException e) {
			System.out.println("Valor negativo ou zero! o valor que vc tentou depositar foi de :" + e.getvalorInvalido());
		}

		c2.depositar(5000);
		System.out.println(c2.getSaldo());
		
		try {
		c2.depositar(100);
		}catch(SaldoInsuficienteException e) {
			System.out.println("Vc tentou transferir " + e.getValor() + ", seu saldo é de " + e.getMessage());
		}catch(ValorInvalidoException e) {
			System.out.println("Valor negativo ou zero! o valor que vc tentou depositar foi de :" + e.getMessage());
		}
		System.out.println("------------------------------");
		c2.depositar(2500);
	
		try {
			c2.sacar(100);
		}catch(SaldoInsuficienteException e) {
			System.out.println("Vc tentou transferir " + e.getValor() + ", seu saldo é de " + e.getMessage());
		}catch(ValorInvalidoException e) {
			System.out.println("Valor negativo ou zero! o valor que vc tentou depositar foi de :" + e.getMessage());
		}
		
		try {
			c2.transferir(c2, c1, 3000);
			}catch(SaldoInsuficienteException e) {
				System.out.println("Vc tentou transferir " + e.getMessage() + ", seu saldo é de " + e.getValor());
			}catch(ValorInvalidoException e) {
				System.out.println("Valor negativo ou zero! o valor que vc tentou depositar foi de :" + e.getvalorInvalido());
			}

		/**
		 * Imprimindo o Saldo
		 */
		System.out.println("c1 = " + c1.getSaldo());
		System.out.println("c2 = " + c2.getSaldo());
	
	}

}
