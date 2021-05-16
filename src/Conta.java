class Conta { //atributos do objeto Conta;
	private double saldo; 
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor; //o this faz referência ao objeto
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true; //o return para a execução do método e volta para quem tava chamando;
		}
		else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}	
	}

	public double getSaldo() {
		
		return this.saldo;
	}
}