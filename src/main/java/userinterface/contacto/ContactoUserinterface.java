package userinterface.contacto;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ContactoUserinterface {

    public static final Target BOTON_SALIR_X = Target.the("Boton x para cerrar el modal de contacto")
            .located(By.xpath(""));

    public static final Target INPUT_EMAIL_DE_CONTACTO = Target.the("Campo para introducir el email de contacto")
            .located(By.xpath(""));

    public static final Target INPUT_NOMBRE_DE_CONTACTO = Target.the("Campo para introducir el nombre de contacto")
            .located(By.xpath(""));

    public static final Target INPUT_MENSAJE = Target.the("Campo para introducir el mensaje")
            .located(By.xpath(""));

    public static final Target BOTON_CERRAR = Target.the("Boton para cerrar el modal de contacto")
            .located(By.xpath(""));

    public static final Target BOTON_ENVIAR_MENSAJE = Target.the("Boton para enviar el mensaje")
            .located(By.xpath(""));
}
