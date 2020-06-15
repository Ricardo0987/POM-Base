package com.pom.base.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

public class BooksObject extends PageObject {

    @FindBy(xpath = "//h2[contains(text(),'All available books')]")
    private WebElementFacade textWelcome;

    @FindBy(xpath = "//tr[2]//td[4]//input[1]")
    private WebElementFacade bookJava;

    @FindBy(xpath = "//tr[3]//td[4]//input[1]")
    private WebElementFacade bookRuby;

    @FindBy(xpath = "//tr[4]//td[4]//input[1]")
    private WebElementFacade bookPython;

    @FindBy(xpath = "//body/center/form[@name='f']/div[@id='available']/input[1]")
    private WebElementFacade btnAdd;

    @FindBy(xpath = " //input[@id='total']")
    private WebElementFacade textResult;

    public WebElementFacade getBookJava() {
        return bookJava;
    }

    public WebElementFacade getBookRuby() {
        return bookRuby;
    }

    public WebElementFacade getBookPython() {
        return bookPython;
    }

    public WebElementFacade getBtnAdd() {
        return btnAdd;
    }

    public WebElementFacade getTextResult() {
        return textResult;
    }

    public WebElementFacade getTextWelcome() {
        return textWelcome;
    }
}
