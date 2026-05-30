package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Marcio Navarro - Fullstack Developer");

		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("123456789");

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

	}

}
