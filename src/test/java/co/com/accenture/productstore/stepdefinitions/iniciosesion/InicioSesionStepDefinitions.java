package co.com.accenture.productstore.stepdefinitions.iniciosesion;

import co.com.accenture.productstore.tasks.comunes.AbrirUrl;
import co.com.accenture.productstore.tasks.iniciosesion.IniciarSesion;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario se encuentra en la pagina de inicio de product store$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeProductStore() {
        OnStage.theActorCalled("El actor").wasAbleTo(AbrirUrl.dePagina());
    }

    @Cuando("^el inicia sesion con su usuario (.*) y clave (.*)")
    public void elIniciaSesionConSuUsuarioYClave(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.usuario(usuario, clave));
    }

}
