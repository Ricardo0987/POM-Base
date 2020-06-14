    # language: es
    Característica: validar funcionalidades pagina de pruebas

      @TestCase1
      Escenario: validar ventana abierta desde el iframe
        Dado que estoy en la pagina principal de Sahi Tests
        Cuando ingreso al link  IFrames Test
        Y accedemos al link Window Open Test del iframe derecho
        Entonces verifico la apertura correcta de la ventana