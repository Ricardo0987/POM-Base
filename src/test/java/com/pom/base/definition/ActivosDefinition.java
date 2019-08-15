package com.pom.base.definition;

import com.pom.base.steps.ActivosStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ActivosDefinition {

    @Steps
    private ActivosStep activos;

    @Dado("^estoy logueado en ACTIVOS TI$")
    public void estoyLogueadoEnACTIVOSTI() {
        activos.ingresarCredenciales();
    }

    @Cuando("^ingreso a centro de costos desde el menu$")
    public void ingresoACentroDeCostosDesdeElMenu() {
        activos.ingresoCentroCostos();
    }

    @Entonces("^valido centro de costos SUFI$")
    public void validoCentroDeCostosSUFI() {
        activos.validarCentroCostos();

    }
}
