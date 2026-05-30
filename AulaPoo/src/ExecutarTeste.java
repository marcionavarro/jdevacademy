import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Módulo Orientação Objeto");
		produto1.setValor(BigDecimal.valueOf(100));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Módulo de Spring Boot API Rest");
		produto2.setValor(BigDecimal.valueOf(300));

		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Módulo de Java JPA");
		produto3.setValor(BigDecimal.valueOf(200));
		
		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("Módulo de Angular");
		produto4.setValor(BigDecimal.valueOf(150));

		Venda venda = new Venda();
		venda.setId(10L);
		venda.setNomeCliente("Marcio Navarro");
		venda.setDescricaoVenda("Venda Curso Formação Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2); /* Não consigo fazer Validações */
		venda.addProduto(produto3); /* Posso fazer validações antes de adicionar na lista */
		venda.addProduto(produto4);
		
		System.out.println("Descrição Venda: " + venda.getDescricaoVenda() + " e o total: " + venda.getValorTotal());
	}

}
