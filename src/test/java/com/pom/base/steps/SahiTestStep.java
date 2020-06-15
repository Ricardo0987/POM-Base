package com.pom.base.steps;

import com.pom.base.pageobjects.HomeObject;
import com.pom.base.pageobjects.IframesTestObject;
import io.vavr.collection.List;
import net.serenitybdd.core.pages.PageObject;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class SahiTestStep extends PageObject {

    private HomeObject homeObject;
    private IframesTestObject iframesTestObject;


    public void abrirPaginaPrincipal() {
        homeObject.open();
    }

    public void clickLinkIframeTest() {
        homeObject.getIframesTestlink().click();
    }

    public void seleccionLinkIframe() {
        getDriver().switchTo().frame(iframesTestObject.getSecondIframe());
        iframesTestObject.getLinkWindowOpenTest().click();

        //seleccion pestaña abierta
        ArrayList<String> browserTabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(browserTabs.get(1));
    }

    public void validarAperturaVentana() {
        //TODO: esperar elemnto
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id<locator>));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(getDriver().getCurrentUrl().contains("/demo/framesTest.htm"));
    }
}
