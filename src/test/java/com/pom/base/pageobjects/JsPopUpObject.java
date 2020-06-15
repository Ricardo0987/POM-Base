package com.pom.base.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://sahitest.com/demo/jsPopup.htm")
public class JsPopUpObject extends PageObject {

    @FindBy(xpath = "//button[contains(text(),'All popup this page')]")
    private WebElementFacade btnAllPopUp;

    @FindBy(xpath = "//a[contains(text(),'Back')]")
    private WebElementFacade btnGoBack;


    public WebElementFacade getBtnAllPopUp() {
        return btnAllPopUp;
    }

    public WebElementFacade getBtnGoBack() {
        return btnGoBack;
    }
}
