    # language: es
    Característica: pruebas Sahi Test

      @TestCase1
      Escenario: validar ventana abierta desde el iframe
        Dado que estoy en la pagina principal de Sahi Tests
        Cuando ingreso al link IFrames Test
        Y accedemos al link Window Open Test del iframe derecho
        Entonces verifico la apertura correcta de la ventana

      @TestCase2
      Escenario: validar mensaje de error 404
        Dado que estoy en la pagina principal de Sahi Tests
        Cuando ingreso al link IFrames Test
        Y accedemos al link Error Page del iframe derecho
        Entonces verifico el mensaje de error


      @TestCase3
      Escenario: validar login exitoso
        Dado que estoy en la pagina de login
        Cuando ingreso credenciales
        Entonces verifico ingreso correcto