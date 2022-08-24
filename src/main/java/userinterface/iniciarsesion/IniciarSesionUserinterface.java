package userinterface.iniciarsesion;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesionUserinterface {

    public static final Target BOTON_SALIR_X = Target.the("Boton x para cerrar el modal de iniciar sesion")
            .located(By.xpath(""));

    public static final Target INPUT_NOMBRE_DE_USUARIO = Target.the("Campo para introducir el nombre de usuario")
            .located(By.xpath("//input[@id = 'loginusername']"));

    public static final Target INPUT_CLAVE = Target.the("Campo para introducir la clave de la cuenta")
            .located(By.xpath("//input[@id = 'loginpassword']"));

    public static final Target BOTON_CERRAR = Target.the("Boton para cerrar el modal de iniciar sesion")
            .located(By.xpath(""));

    public static final Target BOTON_INICIAR_SESION = Target.the("Boton para iniciar la sesion")
            .located(By.xpath("//button[contains(text(), 'Log in')]"));
}
