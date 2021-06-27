#language: es

Característica: Ver hoteles 5 estrellas en cartagena
  Yo, como usuario de la plataforma
  Quiero ver hoteles de cinco estrellas
  Para irme de viaje a cartagena

  @buscarhotelescincoestrellas
  Esquema del escenario: Ver hoteles cinco estrellas en cartagena
    Dado  que el usuario ingresa en la plataforma
    Cuando busca hoteles de cinco estrellas en la ciudad <city>
    Entonces deberia ver el mensaje <messageExpected>

    Ejemplos:
    |city       | messageExpected                           |
    |Cartagena  | Charleston Santa Teresa Cartagena         |