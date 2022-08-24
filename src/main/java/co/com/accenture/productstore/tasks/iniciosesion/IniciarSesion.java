package co.com.accenture.productstore.tasks.iniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.iniciarsesion.IniciarSesionUserinterface.*;
import static userinterface.inicio.InicioUserinterface.MENU_INICIO_SESION;

public class IniciarSesion implements Task {

    private final String usuario;
    private final String clave;

    public IniciarSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static IniciarSesion usuario(String usuario, String clave) {
        return Tasks.instrumented(IniciarSesion.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_INICIO_SESION),
                Enter.theValue(usuario).into(INPUT_NOMBRE_DE_USUARIO),
                Enter.theValue(clave).into(INPUT_CLAVE),
                Click.on(BOTON_INICIAR_SESION)
        );
    }
}
