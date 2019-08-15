package com.pom.base.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testing.choucairtesting.com/ModuloContableErrores/Login.aspx")
public class LoginObject extends PageObject {

    @FindBy(id = "MainContent_LoginUser_UserName")
    private WebElementFacade textBoxUsername;

    @FindBy(id = "MainContent_LoginUser_Password")
    private WebElementFacade textBoxPassword;

    @FindBy(id = "MainContent_LoginUser_LoginButton")
    private WebElementFacade buttonLogin;

    public WebElementFacade getTextBoxUsername() {
        return textBoxUsername;
    }

    public WebElementFacade getTextBoxPassword() {
        return textBoxPassword;
    }

    public WebElementFacade getButtonLogin() {
        return buttonLogin;
    }
}
