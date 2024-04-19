package co.com.stiven.productstore.tasks.iniciosesion;

import co.com.stiven.productstore.util.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import static co.com.stiven.productstore.models.DatosPrueba.obtener;
import static co.com.stiven.productstore.userinterface.iniciosesion.InicioSesionUserinterface.*;

public class IngresarCredencialesIncorrectas implements Task {

    public static IngresarCredencialesIncorrectas ingresar() {
        return Tasks.instrumented(IngresarCredencialesIncorrectas.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LOGIN_MENU),
                Enter.theValue(obtener("usuario")).into(INPUT_USUARIO_LOGIN),
                Enter.theValue(obtener("clave")).into(INPUT_CLAVE_LOGIN),
                Click.on(BTN_LOGIN),
                Esperar.unTiempo(3000),
                Switch.toAlert().andAccept()
        );
    }
}
