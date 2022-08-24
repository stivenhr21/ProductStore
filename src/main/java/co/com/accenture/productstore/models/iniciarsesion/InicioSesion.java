package co.com.accenture.productstore.models.iniciarsesion;

public class InicioSesion {

    private final String usuario;
    private final String clave;

    public InicioSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
}
