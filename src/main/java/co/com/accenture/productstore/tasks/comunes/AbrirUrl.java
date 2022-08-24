package co.com.accenture.productstore.tasks.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.inicio.InicioUserinterface;

public class AbrirUrl implements Task {

    private InicioUserinterface inicioUserinterface;

    public static AbrirUrl dePagina() {
        return Tasks.instrumented(AbrirUrl.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(inicioUserinterface)
        );
    }
}
