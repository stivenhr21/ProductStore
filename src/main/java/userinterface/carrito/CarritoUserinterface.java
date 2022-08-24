package userinterface.carrito;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoUserinterface {

    public static final Target ELIMINAR_PRODUCTO = Target.the("Boton para eliminar un producto del carrito")
            .located(By.xpath(""));

    public static final Target REALIZAR_PEDIDO = Target.the("Boton para proceder con el pedido")
            .located(By.xpath(""));

    public static final Target BOTON_SALIR_X = Target.the("Boton x para cerrar el modal de realizar pedido")
            .located(By.xpath(""));

    public static final Target INPUT_NOMBRE = Target.the("Campo para introducir el nombre del comprador")
            .located(By.xpath(""));

    public static final Target INPUT_PAIS = Target.the("Campo para introducir el pais del comprador")
            .located(By.xpath(""));

    public static final Target INPUT_CIUDAD = Target.the("Campo para introducir la ciudad del comprador")
            .located(By.xpath(""));

    public static final Target INPUT_TARJETA_DE_CREDITO = Target.the("Campo para introducir la tarjeta de credito del comprador")
            .located(By.xpath(""));

    public static final Target INPUT_MES = Target.the("Campo para introducir el mes en que se realiza la compra")
            .located(By.xpath(""));

    public static final Target INPUT_ANIO = Target.the("Campo para introducir el anio en que se realiza la compra")
            .located(By.xpath(""));

    public static final Target BOTON_CERRAR = Target.the("Boton para cerrar el modal de realizar pedido")
            .located(By.xpath(""));

    public static final Target BOTON_COMPRA = Target.the("Boton para cerrar el modal de sobre realizar pedido")
            .located(By.xpath(""));

    public static final Target BOTON_OK = Target.the("Boton para cerrar el popup despues de realizar la compra")
            .located(By.xpath(""));
}
