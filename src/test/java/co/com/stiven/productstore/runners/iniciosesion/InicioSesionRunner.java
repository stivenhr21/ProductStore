package co.com.stiven.productstore.runners.iniciosesion;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/iniciosesion/inicio_sesion.feature",
        tags = "@IniciarSesionUsuarioValido",
        glue = "co.com.stiven.productstore.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class InicioSesionRunner {
}
