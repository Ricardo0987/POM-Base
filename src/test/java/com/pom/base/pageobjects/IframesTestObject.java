package com.pom.base.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IframesTestObject extends PageObject {

    @FindBy(xpath = "//div[@id='another']//iframe")
    private WebElementFacade secondIframe;

    @FindBy(xpath = "//a[text()= 'Window Open Test']")
    private WebElementFacade linkWindowOpenTest;

    @FindBy(xpath = "//a[text()= 'Error Pages']")
    private WebElementFacade linkErrorPage;

    @FindBy(xpath = "//a[text()= '404 Page']")
    private WebElementFacade link404Error;

    @FindBy(xpath = "//h1[contains(text(),'Not Found')]")
    private WebElementFacade titleNotFound;

    public WebElementFacade getLinkWindowOpenTest() {
        return linkWindowOpenTest;
    }

    public WebElementFacade getSecondIframe() {
        return secondIframe;
    }

    public WebElementFacade getLinkErrorPage() {
        return linkErrorPage;
    }

    public WebElementFacade getLink404Error() {
        return link404Error;
    }

    public WebElementFacade getTitleNotFound() {
        return titleNotFound;
    }

}
