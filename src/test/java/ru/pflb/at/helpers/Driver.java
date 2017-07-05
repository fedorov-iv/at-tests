package ru.pflb.at.helpers;

import com.codeborne.selenide.WebDriverRunner;

import javax.xml.ws.WebServiceException;

import  static ru.pflb.at.helpers.SelenideConfuguration.browser;
import static ru.pflb.at.helpers.SelenideConfuguration.withProxy;

/**
 * Created by user on 21.06.2017.
 */
public class Driver extends WebDriverRunner{

    private DriverProxy driverProxy;

    static {
        System.setProperty("webdriver.chrome.driver", "path/to/driver");
    }

    public Driver(){

        if(withProxy){

            driverProxy = new DriverProxy(0);
            setProxy(driverProxy.getSeleniumProxy());

        }

        String test = "test";

        switch(test){

            case "chrome":
                break;
            default:
                throw new WebServiceException("Invalid browser " + browser);



        }
    }

}
