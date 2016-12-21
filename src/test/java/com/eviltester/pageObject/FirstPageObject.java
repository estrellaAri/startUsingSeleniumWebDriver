package com.eviltester.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Training169admin on 21/12/2016.
 */
public class FirstPageObject {

    @FindBy(xpath = "//*[@id=\"header\"]/div/div[2]/div/div/ul/li[1]/a")
    public WebElement elementclick;
}
