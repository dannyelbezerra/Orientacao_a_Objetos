
public class TestaBanco {

	public static void main(String[] args) {

		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profiss�o = "programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo;//associa o cliente paulo � contaDoPaulo
		System.out.println(contaDoPaulo.titular.nome);
	}

}
