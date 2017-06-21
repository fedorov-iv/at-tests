package ru.pflb.at.helpers;


import com.codeborne.selenide.Configuration;
import static java.lang.Integer.parseInt;

/**
 * Created by user on 21.06.2017.
 */
public class SelenideConfuguration extends Configuration {

    static boolean withProxy;
    static String logLevel;

    public SelenideConfuguration(String browser, String logLevel, String withProxy, String timeout){

        savePageSource = false;
        screenshots = false;
        Configuration.browser = browser == null ? "chrome" : browser;
        Configuration.timeout = timeout == null ? 5000 : parseInt(timeout);
        SelenideConfuguration.logLevel = logLevel == null  ? "INFO" : logLevel;
        SelenideConfuguration.withProxy = withProxy == null ? false : Boolean.parseBoolean(withProxy);

    }

    public void startDriverWithCurrentProperties(){

        // new Driver();
    }
}
