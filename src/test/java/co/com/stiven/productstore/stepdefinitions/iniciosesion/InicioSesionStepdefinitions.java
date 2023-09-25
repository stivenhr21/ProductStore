package co.com.stiven.productstore.stepdefinitions.iniciosesion;

import co.com.stiven.productstore.questions.iniciosesion.ValidarInicioSesion;
import co.com.stiven.productstore.tasks.comunes.AbrirUrl;
import co.com.stiven.productstore.tasks.iniciosesion.InicioSesion;
import co.com.stiven.productstore.util.transversal.CargarDatos;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioSesionStepdefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el usuario se encuentra en la pagina de inicio de sesion")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion() {
        OnStage.theActorCalled("El actor").wasAbleTo(AbrirUrl.dePagina());
    }

    @Cuando("el usuario ingresa sus credenciales")
    public void elUsuarioIngresaSusCredenciales(List<Map<String, Object>> informacion) {
        theActorInTheSpotlight().attemptsTo(
                CargarDatos.conLaSiguiente(informacion),
                InicioSesion.login());
    }

    @Entonces("el usuario se visualizara logueado en el sitio web")
    public void elUsuarioSeVisualizaraLogueadoEnElSitioWeb() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidarInicioSesion.exitoso(), Matchers.equalTo(true)
        ));
    }

    @Entonces("el usuario visualizara alerta de usuario invalido")
    public void elUsuarioVisualizaraAlertaDeUsuarioInvalido() {
    }
}
