package com.pom.base.definition;

import com.pom.base.steps.SahiTestStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class SahiTestDefinition {

    @Steps
    private SahiTestStep sahiTestStep;


    @Dado("^que estoy en la pagina principal de Sahi Tests$")
    public void queEstoyEnLaPaginaPrincipalDeSahiTests() {
        sahiTestStep.abrirPaginaPrincipal();
    }

    @Cuando("^ingreso al link IFrames Test$")
    public void ingresoAlLinkIFramesTest() {
        sahiTestStep.clickLinkIframeTest();
    }

    @Y("^accedemos al link Window Open Test del iframe derecho$")
    public void accedemosAlLinkWindowOpenTestDelIframeDerecho() {
        sahiTestStep.seleccionLinkIframe();
    }

    @Entonces("^verifico la apertura correcta de la ventana$")
    public void verificoLaAperturaCorrectaDeLaVentana() {
        sahiTestStep.validarAperturaVentana();
    }


}
