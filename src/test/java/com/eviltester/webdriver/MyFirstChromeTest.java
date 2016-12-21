package com.eviltester.webdriver;

import com.eviltester.pageObject.FirstPageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MyFirstChromeTest {

    @Test
    public void startWebDriver() throws InterruptedException{


        /* The following code is for the Chrome Driver
           You also need to download the ChromeDriver executable
           https://sites.google.com/a/chromium.org/chromedriver/
         */
        String currentDir = System.getProperty("user.dir");
        String chromeDriverLocation = "C:\\Users\\Training169admin\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);

        //If you add the folder with chromedriver.exe to the path then you only need the following line
        // and you don't need to set the property as listed in the 3 lines above
        // e.g. D:\Users\Alan\Documents\github\startUsingSeleniumWebDriver\tools\chromedriver
        WebDriver driver = new ChromeDriver();
        FirstPageObject firstPageObject = PageFactory.initElements(driver, FirstPageObject.class);

        driver.navigate().to("http://www.anyweb.ch/");
        firstPageObject.elementclick.click();
        //driver.wait(4000);

        Assert.assertTrue("title should start differently",
                            driver.getTitle().startsWith("Sitemap"));

        driver.close();
        driver.quit();
    }
}
