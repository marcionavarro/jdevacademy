package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiaClasseJava {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {
			/* new Aluno() é uma instancia (Criação de Objeto) */
			/* aluno1 é uma referencia para o objeto aluno */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento?"); String
			 * rg = JOptionPane.showInputDialog("Documento de RG"); String cpf =
			 * JOptionPane.showInputDialog("Documento de CPF"); String nomeMae =
			 * JOptionPane.showInputDialog("Nome da mãe?"); String nomePai =
			 * JOptionPane.showInputDialog("Nome do pai?"); String dataMatricula =
			 * JOptionPane.showInputDialog("Data da matricula?"); String serieMatriculado =
			 * JOptionPane.showInputDialog("Qual a serie?"); String escola =
			 * JOptionPane.showInputDialog("Nome da escola?")
			 */

			Aluno aluno = new Aluno();

			aluno.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMae);
			 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatricula);
			 * aluno1.setSerieMatriculado(serieMatriculado); aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.disciplinas.add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			int posicao = 1;

			if (escolha == 0) {/* Opção SIM e Zero */
				int continuarRemover = 0;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou  4 ?");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}

			alunos.add(aluno);
		}

		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("marcio")) {
				alunos.remove(aluno);
				break;
			} else {
				System.out.println(aluno.toString());/* Descrição do objeto na memoria */
				System.out.println("Média do aluno 1 = " + aluno.getMediaNota());
				System.out.println("Resultado do aluno 1 = " + aluno.getAlunoAprovado2());
				System.out.println("---------------------------------------------------");
			}

		}

		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas matérias são");

			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}

		}

	}

}
