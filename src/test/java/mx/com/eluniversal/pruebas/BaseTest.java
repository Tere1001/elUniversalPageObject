package mx.com.eluniversal.pruebas;

import mx.com.eluniversal.paginas.HomePage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    HomePage home;
    @Before
    public void setUpTest() {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");
        driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        wait= new WebDriverWait(driver,10 );
        home=new HomePage(driver);
    }

    @After
    public void tearDownTest() {
        driver.quit();
    }
}
