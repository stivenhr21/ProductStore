package userinterface.inicio;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/")
public class InicioUserinterface extends PageObject {

    public static final Target LOGO = Target.the("Logo de la pagina de inicio")
            .located(By.xpath(""));

    public static final Target MENU_INICIO = Target.the("Menu lateral inicio de la pagina de inicio")
            .located(By.xpath(""));

    public static final Target MENU_CONTACTO = Target.the("Menu lateral contacto de la pagina de inicio")
            .located(By.xpath(""));

    public static final Target MENU_SOBRE_NOSOTROS = Target.the("Menu lateral sobre nosotros de la pagina de inicio")
            .located(By.xpath(""));

    public static final Target MENU_CARRITO = Target.the("Menu lateral carrito de la pagina de inicio")
            .located(By.xpath(""));

    public static final Target MENU_INICIO_SESION = Target.the("Menu lateral inicio sesion de la pagina de inicio")
            .located(By.xpath("//a[@id = 'login2']"));

    public static final Target MENU_REGISTRO_USUARIO = Target.the("Menu lateral registro usuario de la pagina de inicio")
            .located(By.xpath(""));

    public static final Target BOTON_CERRAR_SESION = Target.the("Boton del menu lateral cerrar sesion de la pagina de inicio")
            .located(By.xpath(""));

    public static final Target USUARIO_CON_SESION_INICIADA = Target.the("Mensaje de bienvenida del usuario con sesion iniciada")
            .located(By.xpath(""));

    public static final Target CATEGORIA_TELEFONOS = Target.the("Categoria telefonos del menu de inicio")
            .located(By.xpath(""));

    public static final Target CATEGORIA_PORTATILES = Target.the("Categoria portatiles del menu de inicio")
            .located(By.xpath(""));

    public static final Target CATEGORIA_PANTALLAS = Target.the("Categoria pantallas del menu de inicio")
            .located(By.xpath(""));
}
