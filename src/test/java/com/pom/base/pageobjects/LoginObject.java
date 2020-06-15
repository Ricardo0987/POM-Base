package com.pom.base.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class LoginObject extends PageObject {

    @FindBy(xpath = "//input[@name='user']")
    private WebElementFacade textBoxUsername;

    @FindBy(xpath = "//input[@name='password']")
    private WebElementFacade textBoxPassword;

    @FindBy(xpath = "//input[@class='button']")
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
