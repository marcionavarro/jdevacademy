package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Marcio Navarro - Fullstack Developer");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("123456789");
		diretor.setNome("Egidio");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNome("João");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println(" Salário Aluno é igual  " + aluno.salario());
		System.out.println(" Salário Secretario é igual  " + secretario.salario());
		System.out.println(" Salário Diretor é igual  " + diretor.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);

	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais: " + pessoa.getNome() + " e o salario é: " + pessoa.salario());
	}

}
