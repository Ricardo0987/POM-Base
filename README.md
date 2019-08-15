
# Proyecto Base POM 
  
 
   
## BDD  
Se utiliza BDD como framework de automatización para la automatización de los escenarios de prueba, la idea es escribir las pruebas antes de escribir el código fuente, pero en lugar de pruebas unitarias, lo que haremos será escribir pruebas que verifiquen que el comportamiento del código es correcto desde el punto de vista de negocio. Tras escribir las pruebas escribimos el código fuente de la funcionalidad que haga que estas pruebas pasen correctamente. Después refactorizamos el código fuente. Partimos de historias de usuario, siguiendo el modelo Como [rol ] quiero [ característica ] para que [los beneficios]. A partir de aquí, en lugar de describir en 'lenguaje natural' lo que tiene que hacer esa nueva funcionalidad, vamos a usar un lenguaje que nos va a permitir describir todas nuestras funcionalidades de una misma forma, un lenguaje específico para BDD.  
  
## Gherkin  
Se utiliza Gherkin como lenguaje de desarrollo de las funcionalidades dado que es un lenguaje comprensible por humanos y por ordenadores, con el vamos a definir el comportamiento de la página que vamos a automatizar. Se trata de un lenguaje fácil de leer, fácil de entender y fácil de escribir. Utilizar Gherkin nos va a permitir crear una documentación viva a la vez que automatizamos los tests, haciéndolo además con un lenguaje que puede entender negocio. Lo bueno de Gherkin es que para empezar a hacer BDD sólo nos hace falta conocer 5 palabras, con las que construiremos sentencias con las que vamos a describir las funcionalidades:  
  
> **Feature:** Indica el nombre de la funcionalidad que vamos a probar. Debe ser un titulo claro y explicito. Incluimos aqui una descripción en forma de historia de usuario: Como [rol] quiero [caracteristica] para que [los beneficios]. Sobre esta descripción empezaremos a construir nuestros escenarios de prueba.  

> **Scenario:** Describe cada escenario que vamos a probar.  

> **Given:** Provee contexto para el escenario en que se va a ejecutar el test, tales como punto donde se ejecuta el test, o prerequisitos en los datos. Incluye los pasos necesarios para poner al sistema en el estado que se desea probar.  

> **When:** Especifica el conjunto de acciones que lanzan el test. La interacción del usuario que acciona la funcionalidad que deseamos testear.  

> **Then:** Especifica el resultado esperado en el test. Observamos los cambios en el sistema y vemos si son los deseados. Lo normal es probar distintos escenarios para comprobar una determinada funcionalidad. De esta forma vamos a pasar de nuestras historias de usuario a pruebas de comportamiento automatizables.  
## Cucumber  
Se utiliza cucumber como herramienta para para automatizar las pruebas en BDD. Cucumber nos va permitir ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas. Totalmente compatible con el lenguaje Gherkin.  
  
## Gestor de dependencias  
Se crea el proyecto sobre Gradle.  
  
## Practicas de automatización  
El proyecto se monto sobre el Modelo de Objeto de Proyecto (POM), con la siguiente estructura:  
  
src/test/java - en esta carpeta se tiene los paquetes de: definitions, runners, step.  
src/test/resources - en esta carpeta se tiene los paquetes de: app, datadriven, documentos de pruebas, features y logs.
