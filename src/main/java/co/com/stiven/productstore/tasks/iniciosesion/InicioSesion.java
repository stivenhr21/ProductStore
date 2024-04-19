package co.com.stiven.productstore.tasks.iniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.com.stiven.productstore.models.DatosPrueba.obtener;
import static co.com.stiven.productstore.userinterface.iniciosesion.InicioSesionUserinterface.*;

public class InicioSesion implements Task {

    public static InicioSesion usuario() {
        return Tasks.instrumented(InicioSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOGIN_MENU),
                //Enter.theValue(obtener("usuario")).into(INPUT_USUARIO_LOGIN),
                Type.theValue(obtener("usuario")).into(INPUT_USUARIO_LOGIN),
                Enter.theValue(obtener("clave")).into(INPUT_CLAVE_LOGIN),
                Click.on(BTN_LOGIN)
        );
    }
}
