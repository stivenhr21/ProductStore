package userinterface.registrousuario;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuarioUserinterface {

    public static final Target BOTON_SALIR_X = Target.the("Boton x para cerrar el modal de registro de usuario")
            .located(By.xpath(""));

    public static final Target INPUT_NOMBRE_DE_USUARIO = Target.the("Campo para introducir el nombre de usuario a registrar")
            .located(By.xpath(""));

    public static final Target INPUT_CLAVE = Target.the("Campo para introducir la clave de la cuenta a registrar")
            .located(By.xpath(""));

    public static final Target BOTON_CERRAR = Target.the("Boton para cerrar el modal de registro de usuario")
            .located(By.xpath(""));

    public static final Target BOTON_INICIAR_SESION = Target.the("Boton para registrarse")
            .located(By.xpath(""));
}
