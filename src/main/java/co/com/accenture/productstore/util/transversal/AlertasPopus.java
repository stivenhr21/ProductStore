package co.com.accenture.productstore.util.transversal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertasPopus implements Task {

    private static WebDriver driver = new ChromeDriver();

    public static void aceptar() {
        driver.switchTo().alert().accept();
    }

    public static void rechazar() {
        driver.switchTo().alert().dismiss();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
