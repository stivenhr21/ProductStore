package co.com.stiven.productstore.userinterface.iniciosesion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/")
public class InicioSesionUserinterface extends PageObject {

    public static final Target BTN_LOGIN_MENU = Target.the("Opcion del menu para abrir el modulo de login").located(By.xpath("//a[@id = 'login2']"));

    public static final Target INPUT_USUARIO_LOGIN = Target.the("Input para diligenciar el usuario a loguearse").located(By.xpath("//input[@id = 'loginusername']"));

    public static final Target INPUT_CLAVE_LOGIN = Target.the("Input para diligenciar la clave a loguearse").located(By.xpath("//input[@id = 'loginpassword']"));

    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion").located(By.xpath("(//button[@class= 'btn btn-primary'])[3]"));

    public static final Target NOMBRE_USUARIO_LOGUEADO = Target.the("Nombre que se muestra cuando el usuario se loguea").located(By.xpath("//a[@id = 'nameofuser']"));


}
