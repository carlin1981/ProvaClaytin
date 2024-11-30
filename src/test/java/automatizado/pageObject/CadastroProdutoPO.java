package automatizado.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroProdutoPO extends BasePO {
	
	
    @FindBy(id = "nome")
    public WebElement inputNome;

    @FindBy(id = "codigo")
    public WebElement inputCodigo;

    @FindBy(id = "valor")
    public WebElement inputValor;

    @FindBy(id = "quantidade")
    public WebElement inputQuantidade;

    @FindBy(id = "btn-adicionar")
    public WebElement buttonCadastrar;  // Botão de cadastro (caso não seja o botão Criar)

    @FindBy(id = "btn-salvar")  // Novo botão Criar
    public WebElement buttonCriar;  // Botão de "Criar" ou outra ação relevante
    
    @FindBy(id = "data")  // Novo botão Criar
    public WebElement buttondata;  // Botão de "Criar" ou outra ação relevante

    @FindBy(id = "mensagem")
    public WebElement spanMensagem;

    public CadastroProdutoPO(WebDriver driver) {
        super(driver);
    }

    

    

    public String obterTituloPagina() {
        return this.spanMensagem.getText();
    }
}
