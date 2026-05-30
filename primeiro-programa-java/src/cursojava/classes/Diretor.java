package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

/* Classe filha de Pessoa que extende de Pessoa */
public class Diretor extends Pessoa implements PermitirAcesso {

	private String registroEducacao;
	private String tempoDirecao;
	private String titulcao;

	private String login;
	private String senha;
	
	public Diretor() {
	}

	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public String getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulcao() {
		return titulcao;
	}

	public void setTitulcao(String titulcao) {
		this.titulcao = titulcao;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulcao="
				+ titulcao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		return 2575.00;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equals("marcio") && senha.equals("marcio");
	}

}
