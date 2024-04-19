package co.com.stiven.productstore.questions.iniciosesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.stiven.productstore.userinterface.iniciosesion.InicioSesionUserinterface.NOMBRE_USUARIO_LOGUEADO;

public class ValidarInicioSesion implements Question {

    public static ValidarInicioSesion exitoso() {
        return new ValidarInicioSesion();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return NOMBRE_USUARIO_LOGUEADO.resolveFor(actor).isVisible();
    }
}
