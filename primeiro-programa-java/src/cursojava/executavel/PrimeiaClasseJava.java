package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;
import cusro.java.classesauxiliares.FuncaoAutenticacao;

public class PrimeiaClasseJava {

	/* Main é um metodo auto executavel em Java */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");

		if (new FuncaoAutenticacao(new Diretor(login, senha))
				.autenticar()) { /*
									 * Vou travar o contrato para autorizar somente quem realmente tem o contrato
									 * 100% legitimo
									 */

			List<Aluno> alunos = new ArrayList<Aluno>();

			/*
			 * É uma lista que dentro dela temos uma chave que identifica uma sequencia de
			 * valores
			 */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 5; qtd++) {
				/* new Aluno() é uma instancia (Criação de Objeto) */
				/* aluno1 é uma referencia para o objeto aluno */

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");

				String idade = JOptionPane.showInputDialog("Qual a idade?");
				String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
				String rg = JOptionPane.showInputDialog("Documento de RG");
				String cpf = JOptionPane.showInputDialog("Documento de CPF");
				String nomeMae = JOptionPane.showInputDialog("Nome da mãe?");
				String nomePai = JOptionPane.showInputDialog("Nome do pai?");
				String dataMatricula = JOptionPane.showInputDialog("Data da matricula?");
				String serieMatriculado = JOptionPane.showInputDialog("Qual a serie?");
				String escola = JOptionPane.showInputDialog("Nome da escola?");

				Aluno aluno = new Aluno();

				aluno.setNome(nome);

				aluno.setIdade(Integer.valueOf(idade));
				aluno.setDataNascimento(dataNascimento);
				aluno.setRegistroGeral(rg);
				aluno.setNumeroCpf(cpf);
				aluno.setNomeMae(nomeMae);
				aluno.setNomePai(nomePai);
				aluno.setDataMatricula(dataMatricula);
				aluno.setSerieMatriculado(serieMatriculado);
				aluno.setNomeEscola(escola);

				for (int pos = 1; pos <= 1; pos++) {
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

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else {
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
						; /* Reprovado */
					}
				}
			}

			System.out.println("------------------ Lista dos Aprovados ------------------ ");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Aluno " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média e  = " + aluno.getMediaNota());
			}

			System.out.println("------------------ Lista de Recuperação ------------------ ");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Aluno " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média e  = " + aluno.getMediaNota());
			}

			System.out.println("------------------ Lista dos Reprovados ------------------ ");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Aluno " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média e  = " + aluno.getMediaNota());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
	}

}
