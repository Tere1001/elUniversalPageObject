package mx.com.eluniversal.paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    //"HomePage
   // Elementos
    WebDriver driver;
    WebElement logo;
    WebElement encabezadoCompra;
    WebElement precioCompra;
    WebElement encabezadoVenta;
    WebElement precioVenta;
    WebElement porcentajeCompra;
    WebElement porcentajeVenta;

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    // Comportamiento:
    public void navegarPagina(){}
    public void verificarHomePage(){}


    public void verificarTipoCambio(){}

    public void verificarPorcentajes(){}

}
