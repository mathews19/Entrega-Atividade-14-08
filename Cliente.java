package POO;

public class Cliente {
  
	private String primeiroNome;
	private String produtosFavoritos;
	private String estadoCivil;
	
	public Cliente(String nome, String produtos, String estado) {
		primeiroNome = nome;
		produtosFavoritos = produtos;
		estadoCivil = estado;
	}
	public String getInfos() 
	{
		String informacoes = primeiroNome+" "+produtosFavoritos+" "+estadoCivil;
		return informacoes;
	}
}
