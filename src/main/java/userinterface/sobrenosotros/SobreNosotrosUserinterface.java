package userinterface.sobrenosotros;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SobreNosotrosUserinterface {

    public static final Target BOTON_SALIR_X = Target.the("Boton x para cerrar el modal de sobre nosotros")
            .located(By.xpath(""));

    public static final Target BOTON_CERRAR = Target.the("Boton para cerrar el modal de sobre nosotros")
            .located(By.xpath(""));
}
