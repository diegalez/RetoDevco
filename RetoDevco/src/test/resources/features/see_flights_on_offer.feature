#language: es

Característica: Ver vuelos en oferta
  Yo, como usuario de la plataforma
  Quiero ver si hay vuelos en oferta
  Para realizar una reserva

  @vervuelosenoferta
  Esquema del escenario: Ver vuelos en oferta
    Dado  que el usuario ingresa en la plataforma
    Cuando busca ofertas de vuelos por debajo del precio <price>
    Entonces deberia en la ventana ofertas ver el mensaje <messageExpected> con ofertas disponibles


    Ejemplos:
      | messageExpected    |price  |
      | Price (Lowest)     |200    |