package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".top-card:nth-child(3)")
    WebElement alertsFrameWindows;

    public SidePanel getAlertsFrameWindows() {
        //click(alertsFrameWindows); // у кого большой экран монитора
        clickWithJS(alertsFrameWindows, 0, 300);
        return new SidePanel(driver);

    }


    @FindBy(css = ".top-card:nth-child(4)")
    WebElement widgets ;

    public SidePanel getWidgets() {
        //click(widgets); // у кого большой экран монитора
        clickWithJS(widgets, 0, 300 );
        return new SidePanel(driver);
    }

    //
    @FindBy(css = ".top-card:nth-child(2)")
    WebElement forms ;

    public SidePanel getForms() {
        //click(forms); // у кого большой экран монитора
        clickWithJS(forms, 0, 300 ); // у кого маленький экран монитора
        return new SidePanel(driver);
    }

    //
    @FindBy(css = ".top-card:nth-child(5)")
    WebElement interactions;

    public SidePanel getInteractions() {
        //click(interactions); // у кого большой экран монитора
        clickWithJS(interactions, 0, 300 );
        return new SidePanel(driver);
    }

    //
    @FindBy(css = ".top-card:nth-child(1)")
    WebElement elements;

    public SidePanel getElements() {
        clickWithJS(elements, 0, 300 );
        return new SidePanel(driver);
    }

    //


}//class
