package cursojava.classes;

/* Classe filha de Pessoa que extende de Pessoa */
public class Diretor extends Pessoa {

	private String registroEducacao;
	private String tempoDirecao;
	private String titulcao;

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

	
}
