package automatizado.testes;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.pageObject.CadastroProdutoPO;

public class CadastroProdutoTeste extends BaseTest{
	
	private static CadastroProdutoPO produtoPage;
	
	@BeforeClass
	public static void prepararTestes() {
		produtoPage = new CadastroProdutoPO(driver);
		// Click the "Cadastrar" button twice (or "Criar" as per the updated PO)
		produtoPage.buttonCadastrar.click(); 
		produtoPage.buttonCadastrar.click(); 
	}
	
	@Test
	public void TC006_naoDeveCadastrarProdutosComTodosOsCamposVazios() {
		// Preenchendo os campos com valores vazios
		produtoPage.inputCodigo.sendKeys("");
		produtoPage.inputNome.sendKeys("");
		produtoPage.inputQuantidade.sendKeys("");
		produtoPage.inputValor.sendKeys("");
		
		// Acionando o botão salvar (Agora botão "Criar")
		produtoPage.buttonCriar.click();
		
		// Verificando a mensagem exibida
		String mensagem = produtoPage.obterTituloPagina();  // A mudança aqui é o método de obter a mensagem
		assertEquals("Todos os campos são obrigatórios para o cadastro!", mensagem);
	}
	
	@Test
	public void TC007_naoDeveCadastrarProdutosComOCodigoEDataVazios() {
		// Preenchendo campos, mas deixando o código e a data vazios
		produtoPage.inputCodigo.sendKeys("");
		produtoPage.inputNome.sendKeys("Camisa");
		produtoPage.inputQuantidade.sendKeys("1");
		produtoPage.inputValor.sendKeys("100");
		produtoPage.buttondata.sendKeys("");  // Usando o campo de data

		// Acionando o botão salvar
		produtoPage.buttonCriar.click();
		
		// Verificando a mensagem exibida
		String mensagem = produtoPage.obterTituloPagina();  // A mudança aqui é o método de obter a mensagem
		assertEquals("Todos os campos são obrigatórios para o cadastro!", mensagem);
	}
	
	@Test
	public void TC008_naoDeveCadastrarProdutosComONomeEDataVazios() {
		// Preenchendo campos, mas deixando o nome e a data vazios
		produtoPage.inputCodigo.sendKeys("500");
		produtoPage.inputNome.sendKeys("");
		produtoPage.inputQuantidade.sendKeys("1");
		produtoPage.inputValor.sendKeys("100");
		produtoPage.buttondata.sendKeys("");  // Usando o campo de data
		
		// Acionando o botão salvar
		produtoPage.buttonCriar.click();
		
		// Verificando a mensagem exibida
		String mensagem = produtoPage.obterTituloPagina();  // A mudança aqui é o método de obter a mensagem
		assertEquals("Todos os campos são obrigatórios para o cadastro!", mensagem);
	}
}
