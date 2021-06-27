#language: es

Característica: Ver si hay viajes por carretera disponibles
  Yo, como usuario de la plataforma
  Quiero ver si hay viajes disponibles por carretera
  Para irme de viaje

  @buscarviajesxcarretera
  Esquema del escenario: Ver si hay viajes por carretera disponibles
    Dado  que el usuario ingresa en la plataforma
    Cuando busca si hay viajes por carretera disponibles
    Entonces deberia en la ventana inspire ver el mensaje <messageExpected>


    Ejemplos:
      | messageExpected                           |
      | 10 bucket-list road trips                 |