#language: es
#autor: Stiven Hernandez Ramirez

Característica: Sitio web Product Store - Iniciar sesion
  Yo como usuario de Product Store
  Quiero interactuar con la funcionalidad inicio sesion
  para validar su correcto funcionamiento

  @IniciarSesionUsuarioValido
  Esquema del escenario: Iniciar sesion correctamente con un usuario valido
    Dado que el usuario se encuentra en la pagina de inicio de sesion
    Cuando el usuario ingresa sus credenciales
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces el usuario se visualizara logueado en el sitio web
    Ejemplos:
      | usuario                  | clave |
      | stivenhr21TestAutomation | 123   |

  @IniciarSesionUsuarioInvalido
  Esquema del escenario: Ingresar credenciales incorrectas
    Dado que el usuario se encuentra en la pagina de inicio de sesion
    Cuando el usuario ingresa unas credenciales invalidas
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces el usuario visualizara alerta de credenciales invalidas
    Ejemplos:
      | usuario | clave |
      | x       | 0     |
      | x       | /     |