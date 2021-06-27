#language: es

Característica: Ver si hay habitaciones disponibles en un crucero a las bahamas
  Yo, como usuario de la plataforma
  Quiero ver si hay cruceros con habitaciones disponibles
  Para irme de viaje

  @buscarcrucero
  Esquema del escenario: Ver si hay habitaciones disponibles en un crucero a las bahamas
    Dado  que el usuario ingresa en la plataforma
    Cuando busca si hay cruceros disponibles a las Bahamas <city>
    Entonces deberia en la ventana cruise ver el mensaje <messageExpected> que indique que hay habitaciones disponibles


    Ejemplos:
      |city       | messageExpected       |
      |Bahamas    | Balcony               |
