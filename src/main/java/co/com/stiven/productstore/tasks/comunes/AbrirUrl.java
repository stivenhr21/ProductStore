package co.com.stiven.productstore.tasks.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirUrl implements Task {

    public static AbrirUrl dePagina() {
        return Tasks.instrumented(AbrirUrl.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.productStore")
        );
    }
}
