package com.pom.base.definition;

import com.pom.base.steps.ActivosStep;
import com.pom.base.steps.PruebaFase1Step;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class PruebaFase1Definition {

    @Steps
    private PruebaFase1Step pruebaFase1Step;



    @Dado("^que estoy en la pagina principal de Sahi Tests$")
    public void queEstoyEnLaPaginaPrincipalDeSahiTests() {
        pruebaFase1Step.abrirPaginaPrincipal();
    }

    @Cuando("^ingreso al link  IFrames Test$")
    public void ingresoAlLinkIFramesTest() {

    }

    @Y("^accedemos al link Window Open Test del iframe derecho$")
    public void accedemosAlLinkWindowOpenTestDelIframeDerecho() {
    }

    @Entonces("^verifico la apertura correcta de la ventana$")
    public void verificoLaAperturaCorrectaDeLaVentana() {
    }


}
