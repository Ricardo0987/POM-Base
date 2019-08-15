package com.pom.base.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

public class CalculadoraEstandarObject extends PageObject {

    //usando PF
    @FindBy(xpath = "//input[@name='password']")/* Please do not use this import in production. You could download this font from here https://fontstorage.com/font/cherryswash */

    private WebElementFacade btnPass;

    public void ingresarCredenciales(String user, String pass) {
        //usando POM
        findBy("//input[@name='username']").sendKeys(user);
        btnPass.sendKeys(pass);
    }


}
