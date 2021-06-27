Feature: Validar posibles errores

  Yo como usuario quiero replicar casos de prueba para verifica si hay errores que se presentan en https://www.travelocity.com/

  @manual
  @VerificarResponsive
  Scenario: Verificar que cuando se ingrese desde un mobile todos los objetos mantengan un orden
    Given que el cliente se encuentra en la experiencia
    When ingresa desde un dispositivo mobile
    Then se deben cargar todos los elementos de manera correcta
  @manual
  @VerificarSignin
  Scenario: Verificar que cuando se de click en el boton de Sign se abra un popup
    Given que el usuario se encuentra en el home de la experiencia
    When se le presenta un boton de Sign in
    Then valida que se abra un popup con las opciones Sign in y Create a free account
  @manual
  @VerificarCamposVacios
  Scenario: Verificar que la experiencia no permita crear una cuenta si hay campos vacios
    Given que el usuario se encuentra en https://www.travelocity.com/user/createaccount
    When no ingreso datos en todos los campos y le doy click en create account
    Then se muestran mensajes de warning indicando que por favor ingrese los datos
  @manual
  @VerificarEnmascaradoPassword
  Scenario: Verificar que la experiencia no permita ver las credenciales
    Given que el usuario se encuentra en https://www.travelocity.com/user/signin
    When ingreso las credenciales en el textbox Password
    Then se debe mostrar la contraseña enmascarada
  @manual
  @VerificarBotonTraductor
  Scenario: Verificar que el boton traducta correctamente todos los elementos
    Given que el usuario se encuentra en https://www.travelocity.com
    When da click en el boton Español
    Then se deben traducir correctamente todos los elementos en todas las ventanas
  @manual
  @VerificarCarruseles
  Scenario: Verificar la informacion presentada en los carruseles
    Given que el cliente se encuentra en la experiencia
    When ve lo carruseles con la informacion
    Then valida que la informacion sea la correspondiente
  @manual
  @VerificarLoadingEntreCambioDePantallas
  Scenario: Verificar que los loading se muestren correctamente cuando se hace un cambio de pantalla
    Given que el cliente se encuentra en la experiencia
    When realiza una accion que detona un cambio de pantalla
    Then el loading se debe cargar correctamente
  @manual
  @VerificarTiemposDeCargaEnCambioDePantalla
  Scenario: Verificar que cuando se realice un cambio de pantalla no se tarde mas de 5 segundos
    Given que el cliente se encuentra en la experiencia
    When realiza una accion que detona un cambio de pantalla
    Then se debe cargar la siguiente ventana en menos de 6 segundos
  @manual
  @VerificarQR
  Scenario: Verificar que cuando escanee el QR redireccione a la aplicacion de travelocity
    Given que el cliente se encuentra en la experiencia
    When realiza escanea el QR con su dispositivo mobile
    Then se debe cargar la aplicación en su dispositivo
  @manual
  @VerificarMensajesDeCovid
  Scenario: Verificar que cuando se busque un vuelo que pueda verse con inconvenientes con cambios de horario por temas de covid se muestre un mensaje de notificacion
    Given que el cliente se encuentra en la experiencia
    When busca un vuelo y el aropuerto levanta la alerta y prohibe el acceso o cambia horarios por temas de covid
    Then se debe mostrar una alerta indicando "los requisitos de viaje están cambiando rápidamente, incluida la necesidad de realizar pruebas de COVID-19 antes del viaje y poner en cuarentena a la llegada."
  @manual
  @VerificarVentanaDeServicio
  Scenario: Verificar que cuando se ingrese a la ventana de servicio se muestren todos los popular topics
    Given que el cliente se encuentra en la experiencia
    When ingresa a support
    Then se deben mostrar los popular topics
  @manual
  @VerificarChatDeAyuda
  Scenario: Verificar que cuando se de click en el Help para hablar con un agente virtual se abra correctamente
    Given que el cliente se encuentra en la experiencia
    When presiona click en Help
    Then se deben mostrar un popup para hablar con un agente virtual
  @manual
  @VerificarBuscar
  Scenario: Verificar que cuando se de click en buscar si no se ingresan valores se muestren warning
    Given que el cliente se encuentra en la experiencia
    When presiona click buscar pero no ingresó ningun valor
    Then se muestren warning indicando que por favor ingrese la informacion para poder buscar
  @manual
  @VerificarRedireccionImagenTravelocity
  Scenario: Verificar que cuando se de click en la imagen de travelocity desde cualquier ventana este redirija al home
    Given que el cliente se encuentra en la experiencia
    When presiona click en la imagen de travelocity desde cualquier pantalla
    Then lo redirecciona al home
  @manual
  @VerificarEnvioMensajeTexto
  Scenario: Verificar que se envie el mensaje de texto
    Given que el cliente se encuentra en la experiencia
    When selecciona el indicativo del pais e ingresa el numero de celular y da click en obtener aplicacion
    Then se debe enviar un mensaje de texto a su numero de celular