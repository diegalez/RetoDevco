#language: es

Característica: Crear cuenta
  Yo, como usuario de la plataforma
  Quiero crear una cuenta
  Para ver las excursiones disponibles

  @crearcuenta
  Esquema del escenario: crear cuenta
    Dado  que el usuario ingresa en la plataforma
    Cuando crea una cuenta con los siguientes datos
    |firstname    |lastname     |email    |password   |
    |<firstname>  |<lastname>   |<email>  |<password> |
    Entonces deberia en la ventana user ver el mensaje <messageExpected>


    Ejemplos:
      | messageExpected       |firstname|lastname|email       |password                   |
      | Create Account        |Diego    |Zapata  |dz@gmail.com|iO9X27r2RlKsHM9zfu1sxQ==   |