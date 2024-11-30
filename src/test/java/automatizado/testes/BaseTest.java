package automatizado.testes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {

    protected static WebDriver driver;
    private static final String URL_BASE = "C:\\Users\\36129382023.2n\\Downloads\\sistema\\produtos.html"; // URL da página de cadastro de produtos
    private static final String PATH_DRIVE = "C:\\Users\\36129382023.2n\\Downloads\\automatizado\\chromedriver-win64\\chromedriver.exe";

    @BeforeClass
    public static void iniciar() {
        System.setProperty("webdriver.chrome.driver", PATH_DRIVE);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterClass
    public static void finalizar() {
        driver.quit();
    }
}
